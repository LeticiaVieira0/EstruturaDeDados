void main()  {
    //Math.Random para tudo.

    //Variaveis a criar;

    int TotalreqGerados = 0;
    int TotalreqPerdidos = 0;
    int TotalredAtendidas = 0;

    //Criar fila

    //Atendentes vao pegar clientes
    //  Apos pegar mudar sinal: [wait (vermelho), ready (verde),]

    //Clientes:
    //  Tempo de atendimento = number (em seg)

    //Atendente fica travado por cliente.getTempodeatendimento();

    //Fila de clientes btw
    Queue<Cliente> fila = new PriorityQueue<>();
    ArrayList<Atendente> atendentes = new ArrayList<>();

    // ------------------ VARIAVEL PARA ESSE TRUE -> DEADLOCK (SIM/NAO --------------------
    while(true){
        int idCliente = 0;
        int idAtendente = 0;
        //Quantidade de clientes a ser criado, Range 2 até 12
        int nClientes = (int)Math.round((Math.random() * 10) + 2);
        TotalreqGerados += nClientes;

        while(nClientes > 0){
            //Range de tempo 3 até 30
            Cliente cliente = new Cliente((int)Math.round((Math.random() * 30) + 3),idCliente);
            fila.add(cliente);
            nClientes -= 1;
            idCliente += 1;
        }

        //Criar atendentes
        int nAtendentes = 2;

        while(nAtendentes > 0){

            Atendente atendente = new Atendente(idAtendente);
            atendentes.add(atendente);
            nAtendentes -= 1;
            idAtendente -= 1;
        }

        //Botar os atendentes para trabalhar
        while(true) {
            //True atendente pode trabalhar
            //False atendente nao pode trabalhar
            //Construtor nasce com True
            int tempo1 = 0;
            int tempo2 = 0;
            while (atendentes.get(0).isFlag()) {
                assert fila.peek() != null;
                tempo1 = fila.peek().getTempoAtendimento();
                //.poll == .pop
                fila.poll();
                TotalredAtendidas += 1;
                atendentes.get(0).setFlag(false);
                break;
//                continue;
            }

            while (atendentes.get(1).isFlag()) {
                assert fila.peek() != null;
                tempo2 = fila.peek().getTempoAtendimento();
                fila.poll();
                TotalredAtendidas += 1;
                atendentes.get(1).setFlag(false);
                break;
            }

            System.out.println("----------------------------------");
            System.out.println("Fila de clientes: " + fila.size());
            System.out.println("Atendente 0 ocupado por: " + tempo1 + "s");
            System.out.println("Atendente 1 ocupado por: " + tempo1 + "s");
            System.out.println("----------------------------------");

            //Atendendo 1 (era pra ser tempo1 *1000
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            atendentes.get(0).setFlag(true);

            //era pra ser tempo2 *1000
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            atendentes.get(1).setFlag(true);

            //Gerar numero aleatorio pra criar mais cliente de tempo em tempo
            if(fila.size() <= 2){
                nClientes = (int)Math.round((Math.random() * 10) + 2);
                TotalreqGerados += nClientes;
                while(nClientes > 0){
                    //Range de tempo 3 até 30
                    Cliente cliente = new Cliente((int)Math.round((Math.random() * 30) + 3),idCliente);
                    fila.add(cliente);
                    nClientes -= 1;
                    idCliente += 1;
                }
            }

            //Dormindo o sistema por tempo do primeiro cliente e sugundo cliente. depois
            //Flags sao == true
        }

    }
    //Interface Basica
    //sout Fila de clientes
    //Atendentex atendendo cliente.getnome()
    //Atendentex sera liberado em cliente.tempoAtendimento

    //Atendentey atendendo cliente.getnome()
    //Atendentey sera liberado em cliente.tempoAtendimento

}