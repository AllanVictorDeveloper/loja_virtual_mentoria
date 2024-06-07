SELECT constraint_name
FROM information_schema.constraint_column_usage
WHERE table_name = 'usuarios_acesso'
AND column_name = 'acesso_id' and constraint_name <> 'unique_acess_user';


alter table usuarios_acesso  drop constraint  "uk8bak9jswon2id2jbunuqlfl9e";