@TC
Feature: je souhaite tester les boutons logout et about de swaglabs

  Background:
    Given je me connect a l application swagLabs
    When je clique sur le menu burger

  @logout
  Scenario: je souhaite tester le bouton logout
    And je clique sur logout
    Then je me redirige vers la page de connexion "Swag Labs"

  @about
  Scenario: je souhaite tester le bouton about
    And je clique sur about
    Then je me redirige vers la page about
