public class Main {
    private enum DiaDaSemana{SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO,DOMINGO}

    public static void main(String[] args) {
        novosMetodosString();
        System.out.println(switchJava12(DiaDaSemana.SEXTA));
    }
    private static  void novosMetodosString(){
        String resultado = "Olá\nMundo".indent(3);
        System.out.println(resultado);
        resultado = "Olá".transform(s->s.concat("\nmundo\nJava12"))
                         .transform(d->d.toUpperCase());

        System.out.println(resultado);
    }
    private static String switchJava12(DiaDaSemana dia){
        String resultado ="";
        switch (dia){
            case SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA ->  resultado = "Dia Util";
            case SABADO,DOMINGO ->  resultado = "Final de Semana";
            default -> resultado = "Dia invalido";
        }
        return resultado;

    }

}
