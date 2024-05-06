public class Metodos {

    public static void main(String[] args) {
        /**
         * Para metodos, os criterios são:
         * 
         * * Deve ser nomeado como verbo
         * * Seguir o padrão camelCase
         * 
         */

        // EXEMPLO
        /*
         * somar(int n1, int n2){}
         * 
         * abrirConexao(){}
         * 
         * concluirProcessamento() {}
         * 
         * findById(int id){} // não se assuste, você verá muito método em inglês em sua
         * jornada
         * 
         * calcularImprimir(){} // há algo de errado neste método, ele deveria ter uma
         * única finalidade
         */

        /*
         * public class MyClass {
         * 
         * public double somar(int num1, int num2){
         * //LOGICA - FINALIDADE DO MÉTODO
         * return ... ;
         * }
         * 
         * public void imprimir(String texto){
         * //LOGICA - FINALIDADE DO MÉTODO
         * //AQUI NÃO PRECISA DO RETURN
         * //POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
         * }
         * // throws Exception : indica que o método ao ser utilizado
         * // poderá gerar uma exceção
         * public double dividir(int dividendo, int divisor) throws Exception{}
         * 
         * // este método não pode ser visto por outras classes no projeto
         * private void metodoPrivado(){}
         * 
         * //alguns equívocos estruturais
         * public void validar(){
         * //este método deveria retornar algum valor
         * //no caso boolean (true ou false)
         * }
         * public void calcularEnviar(){
         * //um método deve representar uma única responsabilidade
         * }
         * public void gravarCliente(String nome, String cpf, Integer telefone, ....){
         * //este método tem a finalidade de gravar
         * //informações de um cliente, por que não criar
         * //um objeto cliente e passar como parâmetro ?
         * //veja abaixo
         * }
         * public void gravarCliente(Cliente cliente){}
         * //ou
         * public void gravar(Cliente cliente){}
         */

            SmartTv smartTv = new SmartTv();

            System.out.println("TV Ligada? " + smartTv.ligada);
            System.out.println("Canal Atual: " + smartTv.canal);
            System.out.println("Volume Atual: " + smartTv.volume);
            
            smartTv.ligar();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

            smartTv.desligar();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumetarVolume();

            System.out.println("Volume atual: " + smartTv.volume);

            smartTv.aumentarCanal();
            smartTv.aumentarCanal();
            smartTv.aumentarCanal();
            smartTv.diminuirCanal();
            smartTv.mudarCanal(62);
            System.out.println("Canal Atual: " + smartTv.canal);


    }
}