 Feature: Enregistrement d un utilisateur

  En tant que visiteur
  Je veux créer un compte
  Afin d utiliser l application mercury
  
 @register
  Scenario: Création d un compte avec des informations valides
    Given l utilisateur est sur la page d inscription
    When il saisit un nom valide"Bochra"
    And il saisit un email valide"Laamiri"
    And il saisit un téléphone valide"51243678"
    And il saisit un adresse valide"zahra"
    And il saisit un city valide"Tunis"
    And il saisit un provence valide"tunis"
    And il saisit un code postale valide"2080"
    And il saisit un country valide"tunisia"
    And il saisit un username valide"Bochra"
    And il saisit un password valide"Bochra123"
    And il confirme le password"Bochra123"
    And il clique sur "Soummettre"
    Then le compte est créé avec succès
    And un message de confirmation est affiché" Note: Your user name is Bochra Laamiri."