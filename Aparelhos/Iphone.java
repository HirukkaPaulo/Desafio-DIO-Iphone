package Aparelhos;
import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusica;

public class Iphone implements AparelhoTelefonico, ReprodutorMusica, NavegadorInternet{

    public void tocarMusica(){
        System.out.println("Tocando música");
    }
    public void pausar(){
        System.out.println("A música foi pausada");
    }
    public void selecionarMúsica(){
        System.out.println("A música foi selecionada");
    }
    
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz foi iniciado");
    }
   
    public void ligar(int numeroTelefone) {
        System.out.println("Ligando para o número " + numeroTelefone);
    }
   
    public void atender() {
        System.out.println("O correio de voz foi iniciado");
    }
    
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }
   
    public void adicionarNovaAba() {
        System.out.println("A nova aba foi adicionada" );
    }
    
    public void atualizarPagina() {
        System.out.println("A página foi atualizada" );
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.atualizarPagina();
        iphone.ligar(1234);
    }
}