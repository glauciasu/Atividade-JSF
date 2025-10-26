package br.com.meuprojeto;

public class Principal {
    public static void main(String[] args) {
    	 imprimirHtml();
    }

    // Função que imprime todo o HTML do currículo
    public static void imprimirHtml() {
        String[] html = {
            "<!DOCTYPE html>",
            "<html>",
            "<head>",
            "    <meta charset=\"ISO-8859-1\">",
            "    <title>Curriculo Web</title>",
            "    <link rel=\"stylesheet\" href=\"css/style.css\">",
            "</head>",
            "<body>",
            "    <header>",
            "        <h1>Glaucia S. O. Borges</h1>",
            "        <img src=\"eu.jpg\" alt=\"eu\" class=\"foto-perfil\">",
            "    </header>",
            "    <section id=\"dados-pessoais\">",
            "        <h2>Dados Pessoais</h2>",
            "        <p>Endereço: Rua Belo Horizonte, 840</p>",
            "        <p>Email: glaucia.su@hotmail.com</p>",
            "        <p>Telefone: (43) 98411-7099</p>",
            "        <p><a href=\"https://www.instagram.com/glaucia.sborges\" target=\"_blank\">Instagram</a></p>",
            "    </section>",
            "</body>",
            "</html>"
        };

        for (String linha : html) {
            System.out.println(linha);
        }
    }
}
