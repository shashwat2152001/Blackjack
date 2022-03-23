import java.util.Scanner;

public class Blackjack {

    public static void main(String[] args) {

        // Establish a lot of the main variables that will be used in the loop below
        int exitDeclaration = 0;
        int game = 1;
        int card;
        int hand = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        /* Going to declare game tracking variables with the same functions but as a double now since
        "percentage of player wins" requires double precision */
        double playerDubs = 0;
        double dealerDubs = 0;
        double preciseTies = 0;

        String menu = ("1. Get another card\n2. Hold hand\n3. Print statistics\n4. Exit\n\nChoose an option: \n");
        Scanner input = new Scanner(System.in);
        System.out.println("START GAME #" + game);

        P1Random rng = new P1Random();



        int originalNumber = rng.nextInt(13) + 1;
        card = originalNumber;
        hand = originalNumber + hand;
        System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");





        while (exitDeclaration != 4){
        //exitDeclaration != 4 because we want an input of 4 to end the loop



            System.out.print(menu);
            int option = input.nextInt();
            exitDeclaration = option;



                if (option > 4 || option < 1){
                    System.out.println("Invalid input!\n" + "Please enter an integer value between 1 and 4.");
                }


                if (option == 1){
                    int myNumber = rng.nextInt(13) + 1;
                    card = myNumber;

                    if (card < 11){
                        hand = myNumber + hand;
                    }
                    else {
                        hand = 10 + hand;
                    }


                    // this upcoming if statement will make the program list the correct name and value of face cards
                  if (card == 1 || card == 11 || card == 12 || card == 13){


                      if (myNumber == 1){
                          System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                      }
                      else if (myNumber == 11){
                          System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                      }
                      else if(myNumber == 12){
                          System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                      }
                      else if(myNumber == 13){
                          System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                      }


                  }
                  else {
                      System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                  }
                   if (hand == 21){
                       System.out.println("BLACKJACK! You win!");
                       game++;
                       playerWins++;
                       playerDubs++;
                       hand = 0;
                       System.out.println("\nSTART GAME #" + game + "\n");

                       int newNumber = rng.nextInt(13) + 1;
                       card = newNumber;

                       if (card < 11){
                           hand = newNumber + hand;
                       }
                       else {
                           hand = 10 + hand;
                       }



                       if (card == 1 || card == 11 || card == 12 || card == 13 || card < 20){


                           if (newNumber == 1){
                               System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                           }
                           else if (newNumber == 11){
                               System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                           }
                           else if(newNumber == 12){
                               System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                           }
                           else if(newNumber == 13){
                               System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                           }
                           else {
                               System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                           }


                       }


                   }
                   else if (hand > 21){
                       System.out.println("You exceeded 21! You lose.");
                       game++;
                       dealerWins++;
                       dealerDubs++;
                       hand = 0;
                       System.out.println("\nSTART GAME #" + game + "\n");

                       int newNumber = rng.nextInt(13) + 1;
                       card = newNumber;

                       if (card < 11){
                           hand = newNumber + hand;
                       }
                       else {
                           hand = 10 + hand;
                       }


                    /* This may be a redundant if statement because the nested one does pretty much the same thing.
                    However, it makes me feel safer about the probability of the code working correctly. If speed was a
                    concern then I'd consider taking the outer if statement (the one below) out */

                       if (card == 1 || card == 11 || card == 12 || card == 13 || card < 20){


                           if (newNumber == 1){
                               System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                           }
                           else if (newNumber == 11){
                               System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                           }
                           else if(newNumber == 12){
                               System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                           }
                           else if(newNumber == 13){
                               System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                           }
                           else {
                               System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                           }


                       }
                   }

                }


                if (option == 2){
                    game ++;
                    int dealersHand = rng.nextInt(11) + 16;
                    System.out.println("\nDealer's hand: " + dealersHand);
                    System.out.println("Your hand is: " + hand + "\n");

                    if (dealersHand > hand && dealersHand <= 21) {
                        System.out.println("Dealer wins!");
                        dealerWins++;
                        dealerDubs++;
                        hand = 0;
                        System.out.println("\nSTART GAME #" + game + "\n");


                        int newNumber = rng.nextInt(13) + 1;
                        card = newNumber;


                        if (card < 11){
                            hand = newNumber + hand;
                        }
                        else {
                            hand = 10 + hand;
                        }



                        if (card == 1 || card == 11 || card == 12 || card == 13 || card < 20){


                            if (newNumber == 1){
                                System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                            }
                            else if (newNumber == 11){
                                System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 12){
                                System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 13){
                                System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                            }
                            else {
                                System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                            }


                        }

                    }
                    else if (dealersHand == hand){
                        System.out.println("It's a tie! No one wins!");
                        ties++;
                        preciseTies++;
                        hand = 0;
                        System.out.println("\nSTART GAME #" + game + "\n");



                        int newNumber = rng.nextInt(13) + 1;
                        card = newNumber;


                        if (card < 11){
                            hand = newNumber + hand;
                        }
                        else {
                            hand = 10 + hand;
                        }



                        if (card == 1 || card == 11 || card == 12 || card == 13 || card < 20){


                            if (newNumber == 1){
                                System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                            }
                            else if (newNumber == 11){
                                System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 12){
                                System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 13){
                                System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                            }
                            else {
                                System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                            }

                        }

                        }
                    else {
                        System.out.println("You win!");
                        playerWins++;
                        playerDubs++;
                        hand = 0;
                        System.out.println("\nSTART GAME #" + game + "\n");



                        int newNumber = rng.nextInt(13) + 1;
                        card = newNumber;


                        if (card < 11){
                            hand = newNumber + hand;
                        }
                        else {
                            hand = 10 + hand;
                        }



                        if (card == 1 || card == 11 || card == 12 || card == 13 || card < 20){


                            if (newNumber == 1){
                                System.out.println("\nYour card is a ACE!\nYour hand is: " + hand + "\n");
                            }
                            else if (newNumber == 11){
                                System.out.println("\nYour card is a JACK!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 12){
                                System.out.println("\nYour card is a QUEEN!\nYour hand is: " + hand + "\n");
                            }
                            else if(newNumber == 13){
                                System.out.println("\nYour card is a KING!\nYour hand is: " + hand + "\n");
                            }
                            else {
                                System.out.println("\nYour card is a " + card + "!\nYour hand is: " + hand + "\n");
                            }


                        }

                        }
                }
                if (option == 3){
                    System.out.println("\nNumber of Player wins: " + playerWins);
                    System.out.println("Number of Dealer wins: " + dealerWins);
                    System.out.println("Number of tie games: " + ties);
                    System.out.println("Total # of games played is: " + (playerWins + dealerWins + ties));
                    System.out.println("Percentage of Player wins: " + (playerDubs * 100 / (playerDubs + dealerDubs + preciseTies)) + "%\n");
                }
                if (option == 4){
                    exitDeclaration = 4;
                }


        }


    }
}