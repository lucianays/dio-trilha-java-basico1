public class ContaTerminal {
   public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da conta: ");
            int número = scanner.nextInt();

            System.out.println("Por favor, digite o número da Agência: (123-8)");
            int agência = scanner.nextInt();

            System.out.println("Me informe seu nome: ");
            String nomeCliente = scanner.next();
            scanner.nextLine();
                
            System.out.println("Agora me informa seu saldo atual: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " +  nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agência + " Conta " + número + " e seu saldo " + saldo + " já está disponível para saque.");
        }
        }
    
			}

