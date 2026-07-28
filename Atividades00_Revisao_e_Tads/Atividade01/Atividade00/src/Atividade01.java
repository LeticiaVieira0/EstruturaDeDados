void main() {
    //Projeto interno -> Gerente e Funcionarios

    //Regras:
    //Gerente (SalarioBase * (1,01 * QuantidadedeFuncionario)) * (1,1 * (ProjetoFinalizado))
    //Funcionario (SalarioBase) * (1,1 * (ProjetoFinalizado))

    //Classes: Funcionario -> Projeto <- Gerente

    //Do while para o loop:
    //Cadastrar Funcionarios:
    //Cadastrar Gerente:
    //Cadastrar Projeto
    //Consultar projeto

    //Armazenar em listas:
    //Lista de funcionarios
    //Lista de Gerente
    //Lista de projeto

    Scanner sc = new Scanner(System.in);

    Funcionario[] ArrayDeFuncionarios = new Funcionario[10];
    Projeto[] ArrayDeProjetos = new Projeto[10];
    Gerente[] ArrayDeGerentes = new Gerente[10];

    int opcao = 1;
    do{
        System.out.println("===== MENU =====");
        System.out.println("1 - Cadastrar equipe de funcionarios");
        System.out.println("2 - Cadastrar gerente");
        System.out.println("3 - Cadastrar projeto (deve ter funcionario e gerente já)");
        System.out.println("4 - Consultar dados sobre um projeto");
        System.out.println("0 - Sair");

        int okay = sc.nextInt();
        switch (okay) {
            case 1:
                int i = 0;
                System.out.println("Digite a quantidade de funcionarios: ");
                int quantidadedefuncionarios = sc.nextInt();
                System.out.println("Digite o salario base de casa funcionario: ");
                double salariobase = sc.nextDouble();
                double custototal = quantidadedefuncionarios * salariobase;

                ArrayDeFuncionarios[i] = new Funcionario(quantidadedefuncionarios, salariobase, custototal);
                i++;
                break;

            case 2:
                int j = 0;
                System.out.println("Digite o nome do gerente: ");
                String nomeGerente = sc.nextLine();
                System.out.println("Digite o salario do gerente: ");
                double salariogerente = sc.nextDouble();

                ArrayDeGerentes[j] = new Gerente(nomeGerente, salariogerente);

                j++;
                break;

            case 3:
                //Cadastrar projeto
                break;

            case 4:
                //Consultar dados de projeto
                //For each
                break;
            case 0:
                opcao = 0;
                System.out.println("Saindo...");
                System.out.println();
                break;

            default:
                System.out.println("Opção invalida");
                System.out.println();
                break;
        }


    }while(opcao != 0);

}