void main() {
    //Math.Random para tudo.


    //Criar fila

    //Atendentes vao pegar clientes
    //  Apos pegar mudar sinal: [wait (vermelho), ready (verde),]

    //Clientes:
    //  Tempo de atendimento = number (em seg)

    //Atendente fica travado por cliente.getTempodeatendimento();

    //Fila de clientes btw
    Queue<Cliente> fila = new PriorityQueue<>();

    // ------------------ VARIAVEL PARA ESSE TRUE -> DEADLOCK (SIM/NAO --------------------
    while (true){
        int idCliente = 0;
        int idAtendente = 0;
        //Quantidade de clientes a ser criado, Range 2 até 12
        int nClientes = (int)Math.round((Math.random() * 10) + 2);

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
            nAtendentes -= 1;
            idAtendente -= 1;
        }

        //Botar os atendentes para trabalhar
        while(true){
            
        }

    }

    //Interface Basica
    //sout Fila de clientes
    //Atendentex atendendo cliente.getnome()
    //Atendentex sera liberado em cliente.tempoAtendimento

    //Atendentey atendendo cliente.getnome()
    //Atendentey sera liberado em cliente.tempoAtendimento


}