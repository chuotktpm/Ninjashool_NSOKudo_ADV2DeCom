import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.microedition.io.SocketConnection;

public final class cs implements ag {
   public static cs aaa;
   public DataOutputStream aba;
   public DataInputStream aca;
   public ay ada;
   public SocketConnection aea;
   public boolean afa;
   public boolean aga;
   private dr aqa = new dr(this);
   private bi ara = new bi(this);
   private Thread asa;
   private Thread ata;
   private Thread aua;
   private Thread ava;
   public int aha;
   public int aia;
   public long aja;
   private boolean awa;
   public byte[] aka = null;
   private byte axa;
   private byte aya;
   private long aza;
   public String ala = "";
   public static String ama;
   public static int ana;
   public static byte aoa;
   public static boolean apa;
   private static Object baa;

   public static void aaa() {
      aaa = new cs();
      baa = new Object();
   }

   static {
      aa.aaa(24);
      aaa();
   }

   public static cs aba() {
      return aaa;
   }

   public final void aaa(String var1, int var2) {
      String var3 = "socket://" + var1 + ":" + var2;
      if (ab.aya) {
         if (!ab.aca) {
            var3 = var3 + ";interface=wifi";
         } else {
            var3 = var3 + ";deviceside=true";
         }
      }

      System.out.println("connect to " + var3 + " : " + Class_ab.aka);
      if (!this.afa && !this.aga) {
         this.awa = false;
         this.aea = null;
         this.asa = new Thread(new cz(this, var3));
         this.asa.start();
         ama = var1;
         ana = var2;
         aoa = Class_ab.aka;
      }

   }

   public final void aaa(fe var1) {
      this.aqa.aaa.addElement(var1);
   }

   private synchronized void aba(fe var1) {
      byte[] var2 = var1.aba.toByteArray();

      try {
         if (this.awa) {
            this.aba.writeByte(this.aaa(var1.aaa));
         } else {
            this.aba.writeByte(var1.aaa);
         }

         if (var2 != null) {
            int var3 = var2.length;
            if (var1.aaa != -31 && this.awa) {
               byte var5 = this.aaa((byte)(var3 >> 8));
               this.aba.writeByte(var5);
               var5 = this.aaa((byte)var3);
               this.aba.writeByte(var5);
            } else {
               this.aba.writeShort(var3);
            }

            if (this.awa) {
               for(int var6 = 0; var6 < var2.length; ++var6) {
                  var2[var6] = this.aaa(var2[var6]);
               }
            }

            this.aba.write(var2);
            this.aha += 5 + var2.length;
         } else {
            this.aba.writeShort(0);
            this.aha += 5;
         }

         this.aba.flush();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private byte aaa(byte var1) {
      byte[] var10000 = this.aka;
      byte var10003 = this.aya;
      this.aya = (byte)(var10003 + 1);
      var1 = (byte)(var10000[var10003] & 255 ^ var1 & 255);
      if (this.aya >= this.aka.length) {
         this.aya = (byte)(this.aya % this.aka.length);
      }

      return var1;
   }

   public final void aca() {
      Code.aba();
      this.ada();
   }

   public final void ada() {
      this.awa = false;
      this.afa = false;
      this.aga = false;
      this.aka = null;
      this.axa = 0;
      this.aya = 0;
      this.aqa.aaa.removeAllElements();

      try {
         if (this.aea != null) {
            this.aea.close();
            this.aea = null;
         }

         if (this.aba != null) {
            this.aba.close();
            this.aba = null;
         }

         if (this.aca != null) {
            this.aca.close();
            this.aca = null;
         }

         if (this.ata != null) {
            if (this.ata.isAlive()) {
               this.ata.interrupt();
            }

            this.ata = null;
         }

         if (this.asa != null) {
            if (this.asa.isAlive()) {
               this.asa.interrupt();
            }

            this.asa = null;
         }

         if (this.aua != null) {
            if (this.aua.isAlive()) {
               this.aua.interrupt();
            }

            this.aua = null;
         }

         if (this.ava != null) {
            if (this.ava.isAlive()) {
               this.ava.interrupt();
            }

            this.ava = null;
         }

         System.gc();
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public final void aea() {
      if (ab.bda != ab.bfa) {
         ab.aja.afa();
      }

      if (apa) {
         afa();
      } else {
         apa = true;
         (new Thread(new bs(this))).start();
      }
   }

   public static void afa() {
      synchronized(baa) {
         baa.notifyAll();
      }
   }

   static Thread aaa(cs var0) {
      return var0.asa;
   }

   static void aaa(cs var0, Thread var1) {
      var0.ata = var1;
   }

   static Thread aba(cs var0) {
      return var0.ata;
   }

   static dr aca(cs var0) {
      return var0.aqa;
   }

   static void aba(cs var0, Thread var1) {
      var0.aua = var1;
   }

   static bi ada(cs var0) {
      return var0.ara;
   }

   static void aca(cs var0, Thread var1) {
      var0.ava = var1;
   }

   static Thread aea(cs var0) {
      return var0.aua;
   }

   static Thread afa(cs var0) {
      return var0.ava;
   }

   static void aaa(cs var0, long var1) {
      var0.aza = var1;
   }

   static void aaa(cs var0, fe var1) {
      var0.aba(var1);
   }

   static boolean aga(cs var0) {
      return var0.awa;
   }

   static byte aaa(cs var0, byte var1) {
      byte[] var10000 = var0.aka;
      byte var10003 = var0.axa;
      var0.axa = (byte)(var10003 + 1);
      var1 = (byte)(var10000[var10003] & 255 ^ var1 & 255);
      if (var0.axa >= var0.aka.length) {
         var0.axa = (byte)(var0.axa % var0.aka.length);
      }

      return var1;
   }

   static long aha(cs var0) {
      return var0.aza;
   }

   static void aia(cs var0) {
      var0.awa = true;
   }

   static void aaa(long var0) {
      long var2 = var0;
      synchronized(baa) {
         try {
            baa.wait(var2);
         } catch (Exception var4) {
         }

      }
   }

   public static void aga() {
      aaa = null;
      ama = null;
      ana = 0;
      aoa = 0;
      apa = false;
      baa = null;
   }
}
