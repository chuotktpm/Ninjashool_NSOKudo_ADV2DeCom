import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class cz implements Runnable {
   private final String aba;
   final cs aaa;

   cz(cs var1, String var2) {
      this.aaa = var1;
      this.aba = var2;
   }

   public final void run() {
      try {
         cs.aaa(this.aaa, new Thread(new bz(this)));
         cs.aba(this.aaa).start();
         this.aaa.aja = System.currentTimeMillis();
         this.aaa.aga = true;
         this.aaa.afa = true;
         this.aaa.aea = (SocketConnection)Connector.open(this.aba);
         this.aaa.aba = this.aaa.aea.openDataOutputStream();
         this.aaa.aca = this.aaa.aea.openDataInputStream();
         cs.aba(this.aaa, new Thread(cs.aca(this.aaa)));
         cs.aca(this.aaa, new Thread(cs.ada(this.aaa)));
         cs.aea(this.aaa).start();
         cs.afa(this.aaa).start();
         cs.aaa(this.aaa, System.currentTimeMillis());
         cs.aaa(this.aaa, new fe((byte)-27));
         this.aaa.aga = false;
         this.aaa.ada.aca();
      } catch (Exception var2) {
         cs var1 = this.aaa;
         Code.aba();
         var1.ada();
         if (this.aaa.ada != null) {
            this.aaa.ada.aaa();
         }

      }
   }
}
