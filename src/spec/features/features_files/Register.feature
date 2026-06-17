 Feature: verifier le module register
en tant que utilisateur je souhaite remplir le formulaire a fin m enregister au site mercury
  
 @register
  Scenario: Création d un compte avec des informations valides
    Given l utilisateur est sur la page dinscription
    When il saisit un firstname valide"test"
    And il saisit un lastname valide"abc"
    And il saisit un email valide"test123@gmail.com"
    And il saisit un téléphone valide"51243678"
    And il saisit un adresse valide"zahra"
    And il saisit un city valide"Tunis"
    And il saisit un province valide"tunis"
    And il saisit un code postale valide"2080"
    And il saisit un country valide"TUNISIA"
    And il saisit un username valide"test"
    And il saisit un password valide"Test123"
    And il confirme le password"Test123"
    And il clique sur "Soumettre"
    Then le compte est créé avec succès
    And un message de confirmation est affiché"Thank you for registering."