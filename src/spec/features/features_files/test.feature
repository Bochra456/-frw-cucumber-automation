 Feature: Verifier le module register

  En tant que utilisateur
  Je souhaite remplir le formulaire
  Afin de m enregistrer sur le site Mercury

  @tag2
  Scenario Outline: Création d'un compte avec plusieurs utilisateurs

    Given l utilisateur est sur la page d inscription de l application mercury
    When il saisit un firstname valide <firstname>
    And il saisit un lastname valide <lastname>
    And il saisit un email valide <email>
    And il saisit un téléphone valide <phone>
    And il saisit un adresse valide <adresse>
    And il saisit un city valide <city>
    And il saisit un province valide <province>
    And il saisit un code postale valide <codePostal>
    And il saisit un country valide <country>
    And il saisit un username valide <username>
    And il saisit un password valide <password>
    And il confirme le password <password>
    And il clique sur "Soumettre"
    Then le compte est créé avec succès
    And un message de confirmation est affiché "Thank you for registering."

    Examples:

      | firstname | lastname | email             | phone    | adresse | city  | province | codePostal | country | username | password |
      | test      | abc      | test@gmail.com     | 51243678 | zahra   | Tunis | tunis    | 2080       | tUNISIA | test     | Test123  |
      