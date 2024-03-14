import java.util.Scanner;


class keoBuaBao {
   static Scanner input = new Scanner(System.in);
    String getComputerChoice() {
        String computerChoice;

        int ramdomNumber = (int) (Math.random()*3) + 1;

        if(ramdomNumber == 1)
        {
            computerChoice = "keo";
        } else if (ramdomNumber == 2)
        {
            computerChoice = "bua";
        } else 
        computerChoice = "bao";

        return computerChoice;
    }

    String getUserInput() {
        String userInput;
        while(true)
        {
            System.out.println("Vui long chon Keo, Bua hoac Bao");
            userInput = input.nextLine();
            userInput = userInput.toLowerCase();
            if(userInput.equals("keo") || userInput.equals("bua") || userInput.equals("bao") )
            {
                break;
            }
        }
        return userInput;
    }
    String result(String user, String computer)
    {
        if(user.equals(computer))
        {
            return "draw";
        } else if (user.equals("keo") && computer.equals("bao"))
        {
            return "win";
        } else if (user.equals("bua") && computer.equals("keo"))
        {
            return "win";
        } else if(user.equals("bao") && computer.equals("bua"))
        {
            return "win";
        } else 
        return "lose";
    }

    public static void main(String[] args) {
        keoBuaBao object = new keoBuaBao();
        while (true)
        {
        String userInput = object.getUserInput();
        String computerChoice = object.getComputerChoice();
        String result = object.result(userInput, computerChoice);
        System.out.println("User choice: " + userInput);
        System.out.println("Computer choice: " + computerChoice);
        System.out.println("Nguoi choi : " + result);

        System.out.println("Do u want to play again?? y/n");
        String playAgain = input.next();
        if(!(playAgain.equals("y")))
        {
            break;
        }
        }
    }
}