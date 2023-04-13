package contaBanco;

public class ContaBanco {
        //Atributos
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;
        //Métodos personalizados
        public void estadoAtual() {
            System.out.println("---------------------------");
            System.out.println("Numdero da Conta " + getNumConta());
            System.out.println("Tipo " + getTipo());
            System.out.println("Dono " + getDono());
            System.out.println("Saldo " + getSaldo());
            System.out.println("Status " + getStatus());
        
        }
        //Métodos personalizados
    
        public void abrirConta(String t) {
            this.setTipo(t);
            this.setStatus(true); //Método modificador (preferência)
            //this.status = true; //Acesso ao atributo 
            //if ("CC"==t) alternativa
            if ("CC".equals(t)) {
                this.setSaldo(50);
    
            } else if ("CP".equals(t)) {
                this.setSaldo(150);
            }
        }
    
        public void fecharConta() {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro..");
    
            } else if (this.getSaldo() < 0) {
                System.out.println("Contan ão pode ser fechada, pois tem débito.");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso.");
            }
    
        }
    
        public void depositar(float v) {
            if (this.getStatus()) {
    //            this.saldo = this.saldo + v;
                this.setSaldo(this.getSaldo() + v);
                System.out.println("Deposito reliazado na conta de " + this.getDono());
            } else {
                System.out.println("Impossivvel depositar em uma conta fechada");
            }
        }
    
        public void sacar(float v) {
            if (this.getStatus()) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            } else {
                System.out.println("Impossível de sacar de uma conta fechada.");
            }
        }
    
        public void pagarMensalidade() {
            int v = 0;
            if (this.getTipo() == "CC") {
                v = 12;
            } else if (this.getTipo() == "CP") {
                v = 20;
            }
            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga por " + this.getDono());
            } else {
                System.out.println("Impossível pagar uma conta fechada.");
            }
        }
    
        //Métodos especiais
        
        //CONSTRUTOR
        public ContaBanco() {
    //        this.setSaldo(0);
            this.saldo = 0;
    //        this.setStatus(false);
            this.status = false;
        }
    
        public int getNumConta() {
            return numConta;
        }
    
        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public String getDono() {
            return dono;
        }
    
        public void setDono(String dono) {
            this.dono = dono;
        }
    
        public float getSaldo() {
            return saldo;
        }
    
        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }
    
        //Cquando o método retorna is... não usa get, usa-se is...
        public boolean getStatus() {
            return status;
        }
    
        public void setStatus(boolean status) {
            this.status = status;
        }
}
