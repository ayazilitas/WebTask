@wip
Feature:

  Background:
    Given the user go to web page
    When the user clicks the apply button

    Scenario: the user should click the Driver button
      Given the user clicks the "Driver" button
      Then the user verify the text "Drivers generate extra income by simply integrating Ruut Smart Screens on their cars."


    Scenario:the user should click the Biker button
       Given the user clicks the "Biker" button
       Then the user verify the text "Bikers generate extra income by simply integrating Ruut Smart Screens on their bikes."


    Scenario:the user should click the Advertiser button
       Given the user clicks the "Advertiser" button
       Then the user verify the text "Brands and agencies reach audiences via hyper-local, measurable and targeted outdoor campaigns with Ruut Smart Screens."


    Scenario:the user should click the Screen Investor button
       Given the user clicks the "Screen Investor" button
       Then the user verify the text "People generate extra income by purchasing Ruut Smart Screens and having Ruut operate them across its vehicle network."
