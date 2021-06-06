# TestTech-Unlatch
**Q1: Pourriez vous citer un exemple de processus test agile en détaillant les différents types de tests à utiliser.**

  **R1 : Orienté Métier**	
       - Tests fonctionnels 
       - Tests exploratoires 
       - Tests de story 


**Q2: Quelles sont les différences majeures entre la méthodologie de test agile et le cycle en V.**

  **R2 : Cycle en V :**
  - Non itératif
  - Peu de modification possible en cours de développement
  - Documentation lourde en amont (description du besoin / cahier des charges)
  - Toutes les fonctionnalités doivent êtres réalisées et testées avant la livraison finale du produit.
  - Peu de communication entre les équipes et le client, manque de visibilité et de contrôle qualité tout le long d'un projet. 

  **R2 : Méthodologie de test agile :**
  - Itératif. Découpe de la réalisation du projet en différents sprints
  - Plus de flexibilité si le besoin du client change en cours de projet 
  - Documentation plus légère, elle s'adapte au fil du projet
  - Livraison fractionnée. Les fonctionnalités sont développées suivant un ordre de priorité donné en début de projet
  - La communication est continuelle entre les équipes et le client, le contrôle qualité est précoce et le client peu grâce à la livraison fractionnée tester son produit.


**Q3-a : Pourriez vous élaborer une stratégie de test , en détaillant les exigences de tests sur les différents modules.** 

  **R3-a : Plan de test - V1.0 : Amélioration des modules Inscription / Connexion**
  
Rappel des fonctionnalités embarquées : Les évolutions comprennent :
- Evolution du module de connexion
- Modification du module d'inscription 
- Evolution du compte utilisateur (partie mot de passe)
- Suppression du mot de passe généré automatiquement dans l'envoi de mail d'inscription

Bénéfices :
- Protèger les données de l'utilisateur
- Augmenter la sécurité de l'application
- Mettre en place des règles de gestion de mot de passe 

Approche de test :
Pré-recette : 
- Tests d'acceptances ajoutés sur les stories

Recette :
1. Recette fonctionnelle inclura les phases suivantes :
1.1 : Phase de test de bout en bout :
Les scenarios permettront de tester :
- Le module d'inscription 
- La configuration du compte utilisateur 
- Le module connexion

1.2 : Phase de non-régression
- Non régression sur l'envoi de mail d'inscription

Habilités : 
- Utilisateur non connecté 
- Utilisateur enregistré 

Pour répondre au besoin des utilisateurs, nous considérerons dans un premier temps que cette version est pour une utilisation 'Desktop' :
Partie application - Navigateurs : 
1. Chrome 
2. FF

Partie Email : (réception de l'email d'inscription)
1. Gmail
2. Outlook

Périmètre non testés :
Partie application - Navigateurs Desktop / Mobile / Tablette:
1. IE11
2. Edge
3. Safari
4. Opéra

Cette version ne prevoit pas de tester dans un premier temps la partie documents juridiques. Mais une phase exploratoire peut-etre effectuée afin d'assurer un minimun
la non regression de cette partie.

**Q3-b : Pourriez vous rédiger trois scénarios de tests qui couvrent la fonctionnalité critique de l'application.**

**R3-b :** 

SCN 1 : Se connecter suite à une création de compte 
 Test 1 : Réceptionner l'email de confirmation de création de compte
 Test 2 : Vérifier la connexion à la plateforme depuis l'email

SCN 2 : Se connecter et gérer son compte
 Test 1 : Se connecter
 Test 2 : Modifier le mot de passe depuis l'espace personnel et se déconnecter
 Test 3 : Se déconnecter avec le nouveau mot de passe

SCN 3 : Vérifier les changements de paramètres
 Test 1 : Se connecter avec l'ancien mot de passe [non passant]
 Test 2 : Se connecter sans mot de passe [ non passant]
 Test 3 : Se connecter avec les bon identifiants
 
 **Q4 : Tests automatiques**
 
 **R4 :** 
 Selenium IDE

