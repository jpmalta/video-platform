package projetoYoutube;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula1");
        v[1] = new Video("Aula2");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("João Pedro", 20, "M", "jpmaltaa");
        g[1] = new Gafanhoto("Fernanda", 19, "F", "silvfer");

        Visualizacao vis = new Visualizacao(g[0], v[0]);
        vis.toString();

        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        System.out.println(vis.toString());
    }   
} 