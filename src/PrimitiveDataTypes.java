public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte by = 0; //inteiro com 8 bits com sinal
        char c = '0'; //inteiro 16 bits
        short s = 0; //inteiro de 16 bits com sinal 
        int i = 0; 
        long l = 0l; //literal l no final para identificar o long

        float f = 0.0f; //ponto flutuante de 32 bits - literal f no final para identificar o float
        double d = 0.0; //ponto flutuante de 64 bits
        
        boolean bl = true || false;
        
        int i1 = 256;
        short s1 = (short)i1; //possivel truncamento do int para short        
    }
}
