public class ds extends Auto {
   public ds() {
      super.a_();
   }

   public boolean aaa(fz var1) {
      return var1.aua >= 9;
   }

   public void aaa(fz var1, byte var2, byte var3) {
      switch(var1.aua) {
      case 0:
         cm var5 = av.aba[var3];

         for(int var7 = 0; var7 < var5.afa.length; ++var7) {
            if (var5.afa[var7][0].equals("Nói chuyện")) {
               GameScr.aba(var3, var7, 0);
               LockGame.apa();
               return;
            }
         }

         return;
      case 1:
         if (var1.cza.aaa == 0) {
            GameScr.aba(var3, 0, 0);
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 3) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 4) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }
         break;
      case 2:
         if (var1.cza.aaa == 0) {
            if (var1.arrItemBag[0] != null) {
               Service.aaa().aea(0);
            }

            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            if (gn.aoa == 22) {
               this.ada(-1);
               this.aca(0, 1);
               return;
            }

            this.aaa(22, -1, -1, -1);
            return;
         }
         break;
      case 3:
         if (var1.cza.aaa == 0) {
            Thread.sleep(2000L);
            GameScr.aba(4, 0, 0);
            Service.aaa().aaa(9, 0, 3);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 1) {
            if (var1.arrItemBag[0] != null) {
               Service.aaa().aea(0);
            }

            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            if (gn.aoa == 23) {
               this.ada(-1);
               this.aca(1, 1);
               return;
            }

            this.aaa(23, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 3) {
            if (gn.aoa == 23) {
               this.ada(-1);
               this.aca(2, 1);
               return;
            }

            this.aaa(23, -1, -1, -1);
            return;
         }
         break;
      case 4:
         if (var1.cza.aaa == 0) {
            if (gn.aoa == 21) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.aaa(21, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            if (gn.aoa == 21) {
               this.ada(209);
               this.aca(3, 1);
               return;
            }

            this.aaa(21, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 2) {
            if (gn.aoa == 23) {
               this.ada(210);
               this.aca(4, 1);
               return;
            }

            this.aaa(23, -1, -1, -1);
            return;
         }
         break;
      case 5:
         if (var1.cza.aaa == 0) {
            if (gn.aoa == 20) {
               this.ada(-1);
               this.aca(3, 1);
               return;
            }

            this.aaa(20, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            if (gn.aoa == 20) {
               this.ada(211);
               this.aca(54, 1);
               return;
            }

            this.aaa(20, -1, -1, -1);
            return;
         }
         break;
      case 6:
         if (var1.cza.aaa == 0) {
            if (gn.aoa == 26) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.aaa(26, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            super.aaa(2, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }

         if (var1.cza.aaa == 2) {
            super.aaa(71, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }

         if (var1.cza.aaa == 3) {
            super.aaa(26, -2, -1, -1);
            Thread.sleep(500L);
            return;
         }
         break;
      case 7:
         if (var1.cza.aaa == 0) {
            if (gn.aoa == 71) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.aaa(71, -1, -1, -1);
            return;
         }

         if (var1.cza.aaa == 1) {
            super.aaa(var2, -2, -1, -1);
            GameScr.aba(var3, 0, 0);
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 2) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 3) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 4) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 5) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 6) {
            GameScr.aba(var3, 0, 0);
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 7) {
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 8) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 9) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 10) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 11) {
            GameScr.aba(var3, 0, 0);
            Service.aaa().aja(var3, 0);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 12) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 13) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 14) {
            Service.aaa().aja(var3, 2);
            LockGame.apa();
            return;
         }

         if (var1.cza.aaa == 15) {
            Service.aaa().aja(var3, 1);
            LockGame.apa();
            return;
         }
         break;
      case 8:
         if (var1.cza.aaa == 0) {
            if (gn.aoa == 26) {
               this.ada(-1);
               this.aca(-1, 1);
               return;
            }

            this.aaa(26, -1, -1, -1);
            return;
         }

         super.aaa(var2, -2, -1, -1);
         GameScr.aha(var3);
         cm var6 = av.aba[var3];

         for(int var4 = 0; var4 < var6.afa.length; ++var4) {
            if (var6.afa[var4][0].equals("Nói chuyện")) {
               GameScr.aba(var3, var4, 0);
               LockGame.apa();
               Thread.sleep(1000L);
               return;
            }
         }
      }

   }

   public final void aaa() {
      fz var1 = fz.ala();
      if (this.aaa(var1)) {
         GameScr.chatPopup("Xong!");
         Code.aga();
      } else {
         byte var2 = GameScr.bma();
         byte var3 = GameScr.bna();
         if (fz.ala().bba <= 0) {
            Auto.aaa(false);
         } else if (var1.cza == null) {
            if (gn.aoa != var2) {
               super.aaa(var2, -2, -1, -1);
            } else {
               GameScr.aba(var3, 0, 0);
               Service.aaa().aja(var3, 0);
               LockGame.apa();
               super.aha = -1;
            }
         } else if (var1.cza.aaa >= var1.cza.aea.length - 1) {
            if (gn.aoa != var2) {
               super.aaa(var2, -2, -1, -1);
            } else {
               GameScr.aba(var3, 0, 0);
               Service.aaa().aja(var3, 0);
               LockGame.apa();
               super.aha = -1;
            }
         } else {
            this.aaa(var1, var2, var3);
         }
      }
   }

   public String toString() {
      return "Auto Nhiệm Vụ 10";
   }
}
