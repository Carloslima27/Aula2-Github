package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDoPedido1;

public class Pedido1 {
	private Date momento;
	private StatusDoPedido1 status;
	private Cliente1 cliente;
	private List<PedidoItem> item = new ArrayList<>();
	private  SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private  SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
	public Pedido1(Date momento, StatusDoPedido1 status, Cliente1 cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido1 getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido1 status) {
		this.status = status;
	}

	public Cliente1 getCliente() {
		return cliente;
	}

	public void setCliente(Cliente1 cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItem() {
		return item;
	}
	public void addItem(PedidoItem item) {
		this.item.add(item);
	}
	public void removeItem(PedidoItem item) {
		this.item.add(item);
	}
	public double total() {
		double soma = 0.0;
		for(PedidoItem x: item) {
			soma += x.subTotal();
		}
		return soma;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Resumo de Pedido: \n");
		sb.append("Momento do pedido: "+d.format(getMomento())+"\n");
		sb.append("Status do pedido: "+getStatus()+"\n");
		sb.append("Cliente: "+cliente.getNome()+" ("+a.format(cliente.getAniversario())+") - "+cliente.getEmail()+"\n");
		sb.append("Itens de Pedido: \n");
		for(PedidoItem x : item) {
			sb.append(x.getProduto().getNome()+", "+x.getProduto().getPreco()+", Quantidade: "+x.getQuantidade()+", SubTotal: "+x.subTotal()+"\n");
	
		}
		sb.append("Preço total: "+total());
		return sb.toString();
	}
	
	
	
	
	
}
