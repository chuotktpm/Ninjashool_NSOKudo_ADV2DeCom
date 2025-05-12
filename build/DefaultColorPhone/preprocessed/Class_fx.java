
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class Class_fx implements Runnable {
   private final String b;
   final Session_ME a;

   Class_fx(Session_ME var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      try {
         Session_ME.a(this.a, new Thread(new Class_fu(this)));
         Session_ME.b(this.a).start();
         this.a.j = System.currentTimeMillis();
         this.a.g = true;
         this.a.connected = true;
         this.a.e = (SocketConnection)Connector.open(this.b);
         this.a.b = this.a.e.openDataOutputStream();
         this.a.c = this.a.e.openDataInputStream();
         Session_ME.b(this.a, new Thread(Session_ME.c(this.a)));
         Session_ME.c(this.a, new Thread(Session_ME.d(this.a)));
         Session_ME.e(this.a).start();
         Session_ME.f(this.a).start();
         Session_ME.a(this.a, System.currentTimeMillis());
         Session_ME.sendCommand(this.a, new Message((byte)-27));
         this.a.g = false;
         this.a.d.b();
      } catch (Exception var1) {
         this.a.b();
         if (this.a.d != null) {
            this.a.d.c();
         }

      }
   }
}
