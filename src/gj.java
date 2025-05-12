public final class gj {
   private static boolean aca;
   public static boolean aaa;
   public static boolean aba;
   private static boolean ada;
   private static boolean aea;
   private static boolean afa;
   private static boolean aga;
   private static boolean aha;
   private static boolean aia;
   private static boolean aja;
   private static boolean aka;
   private static boolean ala;
   private static boolean ama;
   private static boolean ana;
   private static boolean aoa;
   private static boolean apa;
   private static boolean aqa;
   private static Object ara;
   private static int asa;

   public static void aaa() {
      aca = false;
      aaa = false;
      aba = false;
      ada = false;
      aea = false;
      afa = false;
      aga = false;
      aha = false;
      aia = false;
      aja = false;
      aka = false;
      ala = false;
      ama = false;
      ana = false;
      aoa = false;
      apa = false;
      aqa = false;
      ara = new Object();
   }

   static {
      aa.aaa(69);
      aaa();
   }

   public static void aba() {
      aca = true;
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aca() {
      if (aca) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aca = false;
      }

   }

   public static boolean ada() {
      aba = true;
      long var0 = System.currentTimeMillis();
      synchronized(ara) {
         try {
            ara.wait(32L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 32L;
   }

   public static void aea() {
      if (aba) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aba = false;
      }

   }

   public static void afa() {
      ada = true;
      synchronized(ara) {
         try {
            ara.wait(100L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aga() {
      if (ada) {
         synchronized(ara) {
            ara.notifyAll();
         }

         ada = false;
      }

   }

   public static void aha() {
      aea = true;
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aia() {
      if (aea) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aea = false;
      }

   }

   public static void aja() {
      aja = true;
      synchronized(ara) {
         try {
            ara.wait();
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aka() {
      if (aja) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aja = false;
      }

   }

   public static void ala() {
      afa = true;
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void ama() {
      if (afa) {
         synchronized(ara) {
            ara.notifyAll();
         }

         afa = false;
      }

   }

   public static void ana() {
      aga = true;
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aoa() {
      if (aga) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aga = false;
      }

   }

   public static void apa() {
      aha = true;
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aqa() {
      if (aha) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aha = false;
      }

   }

   public static boolean ara() {
      aia = true;
      long var0 = System.currentTimeMillis();
      synchronized(ara) {
         try {
            ara.wait(2000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 2000L;
   }

   public static void asa() {
      if (aia) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aia = false;
      }

   }

   public static boolean ata() {
      aka = true;
      long var0 = System.currentTimeMillis();
      synchronized(ara) {
         try {
            ara.wait(7000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 7000L;
   }

   public static void aua() {
      if (aka) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aka = false;
      }

   }

   public static boolean ava() {
      asa = Auto.aqa != null ? Auto.aqa.aca : 0;
      ala = true;
      synchronized(ara) {
         try {
            ara.wait(3000L);
         } catch (InterruptedException var1) {
         }
      }

      return Auto.aqa == null || Auto.aqa.aca > asa;
   }

   public static void awa() {
      if (ala) {
         synchronized(ara) {
            ara.notifyAll();
         }

         ala = false;
      }

   }

   public static void axa() {
      ama = true;
      synchronized(ara) {
         try {
            ara.wait(3000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void aya() {
      if (ama) {
         synchronized(ara) {
            ara.notifyAll();
         }

         ama = false;
      }

   }

   public static boolean aza() {
      ana = true;
      long var0 = System.currentTimeMillis();
      synchronized(ara) {
         try {
            ara.wait(5000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 5000L;
   }

   public static void baa() {
      if (ana) {
         synchronized(ara) {
            ara.notifyAll();
         }

         ana = false;
      }

   }

   public static boolean bba() {
      aoa = true;
      if (20000L < 0L) {
         synchronized(ara) {
            try {
               ara.wait();
            } catch (InterruptedException var3) {
            }
         }

         if (fv.aaa) {
            fv.aaa = false;
            return false;
         } else {
            return true;
         }
      } else {
         long var1 = System.currentTimeMillis();
         synchronized(ara) {
            try {
               ara.wait(20000L);
            } catch (InterruptedException var5) {
            }
         }

         if (fv.aaa) {
            fv.aaa = false;
            return false;
         } else {
            return System.currentTimeMillis() - var1 < 20000L;
         }
      }
   }

   public static void bca() {
      if (aoa) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aoa = false;
      }

   }

   public static void bda() {
      apa = true;
      synchronized(ara) {
         try {
            ara.wait(500L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void bea() {
      if (apa) {
         synchronized(ara) {
            ara.notifyAll();
         }

         apa = false;
      }

   }

   public static boolean bfa() {
      System.out.println("WaitDV");
      aqa = true;
      long var0 = System.currentTimeMillis();
      synchronized(ara) {
         try {
            ara.wait(10000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 10000L;
   }

   public static void bga() {
      System.out.println("NotifyDV");
      if (aqa) {
         synchronized(ara) {
            ara.notifyAll();
         }

         aqa = false;
      }

   }

   public static boolean bha() {
      int var0 = 0;

      label31:
      while(var0 < Code.aia.size()) {
         String var1 = (String)Code.aia.elementAt(var0);

         for(int var2 = 0; var2 < gf.bfa.size(); ++var2) {
            ep var3;
            if ((var3 = (ep)gf.bfa.elementAt(var2)).ada.equals(var1)) {
               if (var3.afa == null || ci.aaa(fz.ala().ala, fz.ala().ama, var3.afa.ala, var3.afa.ama) > 100) {
                  return false;
               }

               ++var0;
               continue label31;
            }
         }

         return false;
      }

      return true;
   }

   public static boolean bia() {
      label23:
      for(int var0 = 0; var0 < Code.aia.size(); ++var0) {
         String var1 = (String)Code.aia.elementAt(var0);

         for(int var2 = 0; var2 < gf.bfa.size(); ++var2) {
            if (((ep)gf.bfa.elementAt(var2)).ada.equals(var1)) {
               continue label23;
            }
         }

         return false;
      }

      return true;
   }

   public static void aaa(long var0) {
      if (Code.aha != null) {
         long var2 = System.currentTimeMillis();

         while(!bha() && System.currentTimeMillis() - var2 < var0) {
            Thread.sleep(2000L);
         }

      }
   }

   public static void bja() {
      if (Code.aha != null) {
         long var2 = System.currentTimeMillis();

         while(true) {
            int var0 = 0;

            boolean var10000;
            label37:
            while(true) {
               if (var0 >= Code.aia.size()) {
                  var10000 = true;
                  break;
               }

               String var1 = (String)Code.aia.elementAt(var0);

               for(int var4 = 0; var4 < gf.bfa.size(); ++var4) {
                  ep var5;
                  if ((var5 = (ep)gf.bfa.elementAt(var4)).ada.equals(var1)) {
                     if (var5.afa == null) {
                        var10000 = false;
                        break label37;
                     }

                     ++var0;
                     continue label37;
                  }
               }

               var10000 = false;
               break;
            }

            if (var10000 || System.currentTimeMillis() - var2 >= 300000L) {
               return;
            }

            Thread.sleep(2000L);
         }
      }
   }

   public static void bka() {
      if (Code.aha != null) {
         long var0 = System.currentTimeMillis();

         while(!bia() && System.currentTimeMillis() - var0 < 60000L) {
            Thread.sleep(2000L);
         }

      }
   }

   public static void bla() {
      synchronized(ara) {
         ara.notifyAll();
      }

      aba = false;
      ada = false;
      aea = false;
      afa = false;
      aga = false;
      aha = false;
      aja = false;
      aca = false;
      aia = false;
      aaa = false;
      aka = false;
      ala = false;
      ama = false;
      ana = false;
      aoa = false;
      apa = false;
      gn.bfa = false;
      gn.aha();
   }

   public static void bma() {
      aca = false;
      aaa = false;
      aba = false;
      ada = false;
      aea = false;
      afa = false;
      aga = false;
      aha = false;
      aia = false;
      aja = false;
      aka = false;
      ala = false;
      ama = false;
      ana = false;
      aoa = false;
      apa = false;
      aqa = false;
      ara = null;
      asa = 0;
   }
}
