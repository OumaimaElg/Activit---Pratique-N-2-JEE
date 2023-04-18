# Aterlier2_JEE

En utilisant le framework spring boot, cette activité m'a permis de mettre en pratique la technique ORM avec Spring Data JPA. En créant une entité PATIENT, et en la manipulant grace aux opérations CRUD. 

Spring Boot est un framework qui permet de créer très rapidement des applications Web et d'entreprise avec très peu de configuration ou aucune configuration.

Le projet a été realisé avec Maven, et la version 17 de JDK.

Les dépendances que j'ai utilisé sont Spring data JPA, Lombok, Spring web et  H2 database. Et vers la fin je suis passée vers mysql.

        -Spring Data JPA fournit l’interface JpaRepository<T, ID> qui hérite de CrudRepository<T, ID> et qui fournit un ensemble de méthodes pour interagir avec une base de données relationnelle.
        
        -Lombok a pour but de générer à la compilation du code Java les getters, les setters, la methode toString, ainsi que les constructeurs avec ou sans parametre, à notre place. Tout se fait à l’aide de simples annotations poser dans les classes.
        
        -Spring Web permet de créer des applications Web basées sur Spring avec une configuration minimale.
        
        -H2 est une base de données rapide et légère.
        

Affichage des patients:
![image](https://user-images.githubusercontent.com/93864104/232345799-b8dd5a2d-d934-434f-9803-38bce245c7c5.png)

Recherche d'un patient:
![image](https://user-images.githubusercontent.com/93864104/232345906-8bc89669-4e4d-4f9d-9cfe-dd09d4ce5b2a.png)

Affichage des 5 premiers patients:
![image](https://user-images.githubusercontent.com/93864104/232346025-b92ac75b-971a-48bf-beb4-fbf45171af25.png)

Affichage des patients qui ne sont pas malade:
![image](https://user-images.githubusercontent.com/93864104/232346078-12803504-066b-40d5-aeec-5b7fb3214e2f.png)

Affichage des patients malade:
![image](https://user-images.githubusercontent.com/93864104/232346127-f1ee16c0-5656-4111-aa00-6c3ad9e43eea.png)

Affichage des patients non malade et dont le score est inferieur a 60:
![image](https://user-images.githubusercontent.com/93864104/232346246-64b34cb2-b1de-475f-9e17-577b67373cf7.png)


