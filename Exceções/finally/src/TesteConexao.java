public class TesteConexao {
    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }

//        try (Conexao con = new Conexao()) {
//            con.leDados();
//            con.close();
//        } catch(Exception ex) {
//            System.out.println("Deu erro na conexao");
//        } finally {
//            System.out.println("finally");
//            if(con != null) {
//                con.close();
//            }
//        }
    }
}
