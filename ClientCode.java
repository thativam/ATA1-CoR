public class ClientCode {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Joaozinho", 1000, true);
        IPedidoHandler handler = new NomePedidoHandler();
        IPedidoHandler handlerValor = new ValorPedidoHandler();
        IPedidoHandler handlerEstoque = new EstoquePedidoHandler(); 
        handlerEstoque.setNext(handlerValor).setNext(handler);
        System.out.println(handler.handle(pedido));
    }
}
