
# Service De messagerie avec Grpc #

Cette application est un exemple de service de diffusion. Tout message que vous saisissez est envoyé à tous les utilisateurs connectés
Cette application est un exemple de service de messagerie .Tous les utilisateurs connectés peuvent  choisir leur pseudonyme, voir la liste des utilisateurs en ligne, envoyer un message à un utilisateur spécifique et recevoir les messages entrants des autres utilisateurs ou Quitter le service.
(développé et testé avec JAVA 19.0.2 et Apache Maven 3.9.6 ) 

## Comment l'exécuter ##

`Requirements :`     
        Assurez-vous d'avoir 'Java'  installé sur votre machine.
        Assurez-vous d'avoir 'maven'  installé sur votre machine.

`Les étapes :`

*1- Clonez le dépôt*

*2- Assurez-vous d'être dans le dossier " server/ " dans votre CLI*

*3- Lancez le serveur :*

            mvn exec:java -Dexec.mainClass=code.ChatServer

*4- Assurez-vous d'être dans le dossier " subscribers/ " dans votre CLI*


*5- Lancez les subscribers :*

            mvn exec:java -Dexec.mainClass=code.Subscriber


