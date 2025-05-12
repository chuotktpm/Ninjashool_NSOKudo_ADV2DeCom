import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class df implements Runnable {
   private final String aaa;
   private final String aba;
   private final String aca;
   private final ca ada;
   private final ca aea;

   public static void aaa(String var0, String var1, ca var2, ca var3) {
      (new Thread(new df(var1, var0, var1, var2, var3))).start();
   }

   private df(String var1, String var2, String var3, ca var4, ca var5) {
      this.aaa = var1;
      this.aba = var2;
      this.aca = var3;
      this.ada = var4;
      this.aea = var5;
   }

   public final void run() {
      try {
         MessageConnection var1;
         TextMessage var2;
         (var2 = (TextMessage)(var1 = (MessageConnection)Connector.open(this.aaa)).newMessage("text")).setAddress(this.aaa);
         var2.setPayloadText(this.aba);
         var1.send(var2);
         System.out.println("SMS data: " + this.aba + ", to: " + this.aca);
         this.ada.aaa();
      } catch (Exception var3) {
         this.aea.aaa();
      }
   }
}
