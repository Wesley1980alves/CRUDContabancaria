package cadastro;

public class Conta {
    
    private int id;
    private double deposito;
    private String numero;
    private String nome;
    private String data;
    public double saldo;
    private double total=0;
    private double tranfere;
    private boolean  saca;
    
    
    
   

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", deposito=" + deposito + ", numero=" + numero + ", nome=" + nome + ", data=" + data + ", saldo=" + '}';
    }

   

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getSaldo(double novovalor) {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        public Conta(){
            
        }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    

    public double getTranfere() {
        return tranfere;
    }

    public void setTranfere(double tranfere) {
        this.tranfere = tranfere;
    }

    public boolean getSaca() {
        return saca;
    }

   

    public boolean isSaca() {
        return saca;
    }

    public void setSaca(boolean saca) {
        this.saca = saca;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

   

    
    
}
