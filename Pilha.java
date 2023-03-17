package pilha;

public class Pilha{
	private static int TAM_DEFAULT = 100;
	private int topoPilha;
	private int e[];
	
	public Pilha(int tamanho) { //Construtor 1
		this.e = new int [tamanho];
		this.topoPilha = -1;
	}
	public Pilha() { //Construtor 2
		this(TAM_DEFAULT);
	}
	//Verifica se a pilha está vazia
	public boolean isEmpty() {
		if(this.topoPilha == -1)
			return true;
		else
			return false;
	}
	//Verifica se a pilha está cheia
	public boolean isFull() {
		if (this.topoPilha == this.e.length-1)
			return true;
		else
			return false;
	}
	//Insere um elemento "e" no topo da pilha
	public void push(int e) {
		if (! this.isFull())
			this.e[++this.topoPilha] = e;
		else
			System.out.println("Overflow");
	}
	//Remove um elemento do topo da pilha
	public int pop() {
		if (! this.isEmpty())
			return this.e[this.topoPilha--];
		else {
			System.out.println("Underflow");
			return -1;
		}
	}
	//Retorna o elemento que está no topo da pilha
	public int topo() {
		if (! this.isEmpty())
			return this.e[this.topoPilha];
		else {
			System.out.println("Underflow");
			return -1;
		}
	}
	//Obtém o total de elementos armazenados na pilha
	public int sizeElements() {
		return topoPilha+1;
	}
	
}
