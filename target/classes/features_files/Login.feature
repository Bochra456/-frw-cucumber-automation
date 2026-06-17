Feature: je verifie la page de connexion
  Entant que utilisateur je souhaite de m authentifier au site mercury

  @connexion
  Scenario: je verifie la page de connexion
  Given je connecte sur la page de l application
  When je saisie le username "test"
  And je saisie le mot de passe "test"
  And je clique sur le bouton Submit
  Then je me redirige vers la page d accueil "Login Successfully"
  