import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;

public final class ed extends fb implements ag {
   private eq ada;
   private eq aea;
   private eq afa;
   private eq aga;
   private static ed aha;
   private int aia;
   private int aja;
   private int aka;
   private int asa;
   private boolean ata = false;
   private boolean aua = false;
   private ca ava;
   private ca awa;
   private ca axa;
   private ca aya;
   public static int aaa;
   public static Image aba;
   private int aza;
   private String[] baa;
   private int bba = -1;
   private int bca = 2;
   private int bda = 0;
   private int bea = -40;
   private int bfa = 1;
   public static boolean aca;
   private String bga = "";

   public final void aaa() {
      if (fd.aca("random") == null) {
         fd.aaa("random", ez.aea());
      }

      this.aka = -50;
      this.aua = false;
      GameScr.aca = GameCanvas.baa;
      if (GameCanvas.bqa == 2) {
         GameCanvas.aaa(0);
      } else {
         GameCanvas.aaa(TileMap.ama);
      }

      super.aaa();
      if (GameScr.aaa != null) {
         GameScr.aaa = null;
      }

      if (GameCanvas.bea != null) {
         GameCanvas.bea = new ck();
      }

      GameCanvas.aca = false;
      int var1;
      if ((var1 = fd.ada("isSoftKey")) <= 0) {
         fd.aaa("isSoftKey", 1);
         GameScr.gsa = true;
      } else if (var1 == 1) {
         GameScr.gsa = true;
      } else if (var1 == 2) {
         GameScr.gsa = false;
      }

      if ((var1 = fd.ada("isSound")) < 0) {
         fd.aaa("isSound", 1);
         ec.aaa = true;
      } else if (var1 == 1) {
         ec.aaa = true;
      } else if (var1 == 2) {
         ec.aaa = false;
      }

      super.ala = this.aya = new ca("Q.Mật Khẩu", this, 2005, (Object)null);
   }

   public final void ada() {
      this.aua = true;
      this.aka = -50;
      GameScr.aca = GameCanvas.baa;
      if (GameCanvas.bqa == 2) {
         GameCanvas.aaa(0);
      } else {
         GameCanvas.aaa(TileMap.ama);
      }

      super.aaa();
      if (GameScr.aaa != null) {
         GameScr.aaa = null;
      }

      if (GameCanvas.bea != null) {
         GameCanvas.bea = new ck();
      }

      GameCanvas.aca = false;
      super.ala = this.aya = new ca("Hủy", this, 20051, (Object)null);
   }

   public ed() {
      aha = this;
      this.aua = false;
      if ((TileMap.ama = (byte)((int)(System.currentTimeMillis() % 9L))) == 5 || TileMap.ama == 6) {
         TileMap.ama = 4;
      }

      GameScr.aaa(true);
      GameScr.aia = 100;
      if (GameCanvas.baa > 200) {
         this.asa = GameCanvas.bca - 80;
      } else {
         this.asa = GameCanvas.bca - 65;
      }

      this.aka = -50;
      this.aja = GameCanvas.aza - 30;
      if (this.aja < 135) {
         this.aja = 135;
      }

      if (this.aja > 155) {
         this.aja = 155;
      }

      this.aza = GameCanvas.bca - fb.aoa - 5;
      if (GameCanvas.baa <= 160) {
         this.aza = 20;
      }

      this.ada = new eq();
      this.ada.aua = er.dda;
      this.ada.aaa = GameCanvas.bba - 20 - 57;
      this.ada.aba = this.aza;
      this.ada.aca = this.aja;
      this.ada.ada = fb.aoa + 2;
      this.ada.aea = true;
      this.ada.ara = 3;
      this.aea = new eq();
      this.aea.aua = er.dea;
      this.aea.aaa = GameCanvas.bba - 20 - 57;
      this.aea.aba = this.aza += 35;
      this.aea.aca = this.aja;
      this.aea.ada = fb.aoa + 2;
      this.aea.aea = false;
      this.aea.ara = 2;
      this.afa = new eq();
      this.afa.aua = er.dka;
      this.afa.aaa = GameCanvas.bba - 20 - 57;
      this.afa.aba = this.aza += 35;
      this.afa.aca = this.aja;
      this.afa.ada = fb.aoa + 2;
      this.afa.aea = false;
      this.afa.ara = 2;
      this.aga = new eq();
      this.aga.aua = "Email/Số di động";
      this.aga.aaa = GameCanvas.bba - 20 - 57;
      this.aga.aba = this.aza += 35;
      this.aga.aca = this.aja;
      this.aga.ada = fb.aoa + 2;
      this.aga.aea = false;
      this.aga.ara = 3;
      this.ata = true;
      if (ez.aaa != null) {
         if (ez.aaa.startsWith("tmpusr")) {
            this.ada.aaa("");
            this.aea.aaa("");
         } else {
            this.ada.aaa(ez.aaa);
            this.aea.aaa(ez.aba);
         }
      }

      this.aia = 0;
      this.ava = new ca(er.dca, this, 2000, (Object)null);
      this.awa = new ca(er.dla, this, 2001, (Object)null);
      this.axa = new ca(er.dca, this, 2002, (Object)null);
      if (!this.aua) {
         super.ala = this.aya = new ca("Q.Mật Khẩu", this, 2005, (Object)null);
      } else {
         super.ala = this.aya = new ca("Hủy", this, 20051, (Object)null);
      }

      if (GameCanvas.afa && GameCanvas.aza >= 320) {
         super.ama = null;
         super.ana = this.ava;
      } else {
         super.ama = this.ava;
         super.ana = this.ada.ava;
      }
   }

   public static ed aea() {
      return aha;
   }

   private static void aaa(boolean var0) {
      GameCanvas.aca = var0;
      fd.aaa("isGPRS", var0 ? 1 : 2);
   }

   private void aaa(String var1) {
      Class_ab.aga = Class_ab.aaa[0];
      GameCanvas.aba(er.ena);
      GameCanvas.aca();
      GameCanvas.aba(er.eoa);
      Service.aaa().aba();
      Service var10000 = Service.aaa();
      String var4 = this.aga.aia;
      String var3 = this.aea.aia;
      String var2 = var1;
      Service var7 = var10000;

      try {
         fe var5;
         (var5 = new fe((byte)118)).aca.writeUTF(var2);
         var5.aca.writeUTF(var3);
         var5.aca.writeUTF(var4);
         var7.aaa.aaa(var5);
         var5.aca();
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   private void ala() {
      this.bba = GameCanvas.aua % er.bca.length;
      this.baa = fw.aka.aba(er.bca[this.bba], GameCanvas.aza - 40);
      String var1 = this.ada.aia.toLowerCase().trim();
      String var2 = this.aea.aia.toLowerCase().trim();
      if (var1.equals("a") && var2.equals("a")) {
         aaa = 1;
      } else if (var1.equals("b") && var2.equals("b")) {
         aaa = 2;
      }

      if (var1 != null && var2 != null && !var1.equals("")) {
         if (var2.equals("")) {
            this.aia = 1;
            this.ada.aea = false;
            this.aea.aea = true;
            super.ana = this.aea.ava;
            return;
         }

         GameCanvas.aba(er.ena);
         GameCanvas.aca();
         GameCanvas.aba(er.epa);
         Service.aaa().aaa(var1, var2, "1.4.8");
         aca = true;
         if (this.ata) {
            fd.aaa("check", 1);
            fd.aaa("acc", var1);
            fd.aaa("pass", var2);
         } else {
            fd.aaa("check", 2);
            fd.aaa("acc", "");
            fd.aaa("pass", "");
         }

         this.aia = 0;
      }

   }

   public final void aba() {
      if (++GameScr.aia > GameCanvas.aza * 3 + 100) {
         GameScr.aia = 100;
      }

      this.ada.ada();
      this.aea.ada();
      if (this.aua) {
         this.afa.ada();
         this.aga.ada();
      }

      if (this.asa != this.aka) {
         this.aka += this.asa - this.aka >> 1;
      }

      if (GameCanvas.afa) {
         super.ama = null;
         if (this.aua) {
            super.ana = this.axa;
         } else {
            super.ana = this.ava;
         }
      } else if (this.aua) {
         super.ama = this.axa;
      } else if (this.aia == 2) {
         super.ama = this.awa;
         if (this.ata) {
            super.ama.aaa = er.dma;
         } else {
            super.ama.aaa = er.dla;
         }
      } else {
         super.ama = this.ava;
      }

      if (this.bda >= 0) {
         this.bea += this.bfa * this.bda;
         this.bda += this.bfa * this.bca;
         if (this.bda <= 0) {
            this.bfa = -this.bfa;
         }

         if (this.bea > 0) {
            this.bfa = -this.bfa;
            this.bda -= 2 * this.bca;
         }
      }

      if (this.bba >= 0 && GameCanvas.aua % 100 == 0) {
         ++this.bba;
         if (this.bba >= er.bca.length) {
            this.bba = 0;
         }

         this.baa = fw.aka.aba(er.bca[this.bba], GameCanvas.aza - 40);
      }

   }

   public final void aaa(int var1) {
      if (this.ada.aea) {
         this.ada.aaa(var1);
      } else if (this.aea.aea) {
         this.aea.aaa(var1);
      } else if (this.aua && this.afa.aea) {
         this.afa.aaa(var1);
      } else if (this.aua && this.aga.aea) {
         this.aga.aaa(var1);
      }

      super.aaa(var1);
   }

   public final void d_() {
      super.d_();
   }

   public final void aaa(as var1) {
      var1.aaa(0);
      var1.aca(0, 0, GameCanvas.aza, GameCanvas.baa);
      GameCanvas.aaa(var1);
      int var2 = this.ada.aba - 45;
      if (GameCanvas.baa <= 220) {
         var2 += 5;
      }

      if (GameCanvas.bia == null) {
         if (this.aua) {
            fk.aaa(GameCanvas.bba - 85, this.ada.aba - 15, 170, 150, var1);
         } else {
            fk.aaa(GameCanvas.bba - 85, this.ada.aba - 15, 170, 90, var1);
         }

         if (GameCanvas.baa > 160 && aba != null) {
            var1.aaa(aba, GameCanvas.bba, var2 - 2, 3);
         }

         this.ada.aaa(var1);
         this.aea.aaa(var1);
         if (this.aua) {
            this.afa.aaa(var1);
            this.aga.aaa(var1);
         }

         var1.ada(0, 0, GameCanvas.aza, GameCanvas.baa);
         if (GameCanvas.aza > 200) {
            if (this.ada.aia.equals("")) {
               if (!this.ada.aea) {
                  fw.aga.aaa(var1, er.dda, this.ada.aaa + 5, this.ada.aba + 7, 0);
               } else {
                  fw.ama.aaa(var1, er.dda, this.ada.aaa + 5, this.ada.aba + 7, 0);
               }
            }

            if (this.aea.aia.equals("")) {
               if (!this.aea.aea) {
                  fw.aga.aaa(var1, er.dea, this.aea.aaa + 5, this.aea.aba + 7, 0);
               } else {
                  fw.ama.aaa(var1, er.dea, this.aea.aaa + 5, this.aea.aba + 7, 0);
               }
            }

            if (this.aua) {
               if (this.afa.aia.equals("")) {
                  if (!this.afa.aea) {
                     fw.aga.aaa(var1, er.dfa, this.afa.aaa + 5, this.afa.aba + 7, 0);
                     fw.aga.aaa(var1, er.dea, this.afa.aaa + 50, this.afa.aba + 7, 0);
                  } else {
                     fw.ama.aaa(var1, er.dfa, this.afa.aaa + 5, this.afa.aba + 7, 0);
                     fw.ama.aaa(var1, er.dea, this.afa.aaa + 50, this.afa.aba + 7, 0);
                  }
               }

               if (this.aga.aia.equals("")) {
                  if (!this.aga.aea) {
                     fw.aga.aaa(var1, "Email/số di động", this.aga.aaa + 5, this.aga.aba + 5, 0);
                  } else {
                     fw.ama.aaa(var1, "Email/số di động", this.aga.aaa + 5, this.aga.aba + 5, 0);
                  }
               }
            }
         } else {
            if (this.ada.aia.equals("")) {
               fw.aga.aaa(var1, er.dga, this.ada.aaa - 35, this.ada.aba + 7, 0);
            }

            if (this.aea.aia.equals("")) {
               fw.aga.aaa(var1, er.dha, this.aea.aaa - 35, this.aea.aba + 7, 0);
            }

            if (this.aua) {
               fw.aga.aaa(var1, er.dia, this.afa.aaa - 35, this.afa.aba - 1, 0);
               fw.aga.aaa(var1, er.dha, this.afa.aaa - 35, this.afa.aba + 13, 0);
               fw.aga.aaa(var1, "Email/số di động", this.aga.aaa - 35, this.aga.aba + 5, 0);
            }
         }
      } else if (this.baa != null) {
         for(var2 = 0; var2 < this.baa.length; ++var2) {
            fw.aka.aaa(var1, this.baa[var2], GameCanvas.aza / 2, this.ada.aba - 15 + var2 * 10, 2, fw.ama);
         }
      }

      String var3 = "1.4.8";
      if (aca) {
         var3 = cs.aba().ala;
      }

      fw.ama.aaa(var1, var3, GameCanvas.aza - 5, 5, 1);
      super.aaa(var1);
   }

   public final void aca() {
      if (GameCanvas.aka[2]) {
         --this.aia;
         if (this.aia < 0) {
            this.aia = 3;
         }
      } else if (GameCanvas.aka[8]) {
         ++this.aia;
         if (this.aia > 3) {
            this.aia = 0;
         }
      }

      if (GameCanvas.aka[2] || GameCanvas.aka[8]) {
         GameCanvas.aka();
         if (this.aia == 1) {
            this.ada.aea = false;
            this.aea.aea = true;
            this.afa.aea = false;
            this.aga.aea = false;
            super.ana = this.aea.ava;
         } else if (this.aia == 0) {
            this.ada.aea = true;
            this.aea.aea = false;
            this.afa.aea = false;
            this.aga.aea = false;
            super.ana = this.ada.ava;
         } else {
            this.ada.aea = false;
            this.aea.aea = false;
            if (this.aua) {
               if (this.aia == 2) {
                  this.afa.aea = true;
                  this.aga.aea = false;
                  super.ana = this.afa.ava;
               } else if (this.aia == 3) {
                  this.aga.aea = true;
                  this.afa.aea = false;
                  super.ana = this.aga.ava;
               }
            }
         }
      }

      if (GameCanvas.aoa) {
         if (GameCanvas.aba(this.ada.aaa, this.ada.aba, this.ada.aca, this.ada.ada)) {
            this.aia = 0;
         } else if (GameCanvas.aba(this.aea.aaa, this.aea.aba, this.aea.aca, this.aea.ada)) {
            this.aia = 1;
         } else {
            if (this.aua) {
               if (GameCanvas.aba(this.afa.aaa, this.afa.aba, this.afa.aca, this.afa.ada)) {
                  this.aia = 2;
               } else if (GameCanvas.aba(this.aga.aaa, this.aga.aba, this.aga.aca, this.aga.ada)) {
                  this.aia = 3;
               }
            } else if (GameCanvas.aba(this.ada.aaa - 20, GameCanvas.bca + 40, 80, 20)) {
               this.ata = !this.ata;
            }

            this.aia = 2;
         }
      }

      super.aca();
      GameCanvas.aka();
   }

   public final void aaa(int var1, Object var2) {
      int var8;
      switch(var1) {
      case 1002:
         this.aua = true;
         this.afa.aea = false;
         this.aga.aea = false;
         this.aea.aea = false;
         this.ada.aea = true;
         super.ana = this.ada.ava;
         super.ala = new ca(er.eha, this, 10021, (Object)null);
         return;
      case 1003:
         try {
            Class_ab.aja.platformRequest("http://ninjaschool.vn");
            return;
         } catch (ConnectionNotFoundException var3) {
            return;
         }
      case 1004:
         ev var6 = new ev();
         var8 = fd.ada("lowGraphic");
         if (!GameCanvas.afa) {
            if (var8 == 1) {
               var6.addElement(new ca(er.doa, this, 10041, (Object)null));
            } else {
               var6.addElement(new ca(er.dpa, this, 10042, (Object)null));
            }
         }

         var6.addElement(new ca(er.bia, this, 1006, (Object)null));
         if (GameCanvas.bda == this) {
            var6.addElement(new ca(er.bja, this, 1009, (Object)null));
         }

         GameCanvas.bea.aaa(var6);
         return;
      case 1005:
         GameCanvas.aaa(er.dxa, new ca("3G/Wifi", this, 3000, (Object)null), new ca("GPRS", this, 3001, (Object)null));
         return;
      case 1006:
         GameCanvas.aaa(er.bla, new ca(er.ega, this, 10061, (Object)null), new ca(er.cza, GameCanvas.aba(), 8882, (Object)null));
         return;
      case 1007:
         if (ec.aaa = !ec.aaa) {
            fd.aaa("isSound", 1);
            return;
         }

         fd.aaa("isSound", 2);
         System.out.println("tat am thanh");
         return;
      case 1009:
         fd.aaa();
         return;
      case 2000:
         if (!this.ada.aia.equals("") && !this.aea.aia.equals("")) {
            ez.aca = this.ada.aia;
            ez.ada = this.aea.aia;
         }

         GameCanvas.bfa.aaa();
         return;
      case 2001:
         if (this.ata) {
            this.ata = false;
            return;
         }

         this.ata = true;
         return;
      case 2002:
         if (this.ada.aia.equals("")) {
            GameCanvas.aaa(er.dqa);
            return;
         } else {
            char[] var5 = this.ada.aia.toCharArray();

            for(var8 = 0; var8 < var5.length; ++var8) {
               if (!eq.aaa(var5[var8])) {
                  GameCanvas.aaa(er.dra);
                  return;
               }
            }

            if (this.aea.aia.equals("")) {
               GameCanvas.aaa(er.dsa);
               return;
            } else if (this.afa.aia.equals("")) {
               GameCanvas.aaa(er.dta);
               return;
            } else if (this.ada.aia.length() < 5) {
               GameCanvas.aaa(er.dua);
               return;
            } else if (!this.aea.aia.equals(this.afa.aia)) {
               GameCanvas.aaa(er.dva);
               return;
            } else {
               if (!this.aga.aia.equals("")) {
                  GameCanvas.bja.aaa(er.dwa[0] + " " + this.ada.aia + ", " + er.dwa[1], new ca(er.ega, this, 4000, (Object)null), (ca)null, new ca(er.cza, GameCanvas.aja, 8882, (Object)null));
                  GameCanvas.bia = GameCanvas.bja;
                  return;
               }

               GameCanvas.aaa("Bạn chưa nhập Email/số di động, Email/số di động giúp bạn lấy lại mật khẩu khi mất mật khẩu", new ca("Tiếp Tục", this, 4001, (Object)null), new ca(er.cza, GameCanvas.aja, 8882, (Object)null));
               return;
            }
         }
      case 2003:
         Class_ab.aaa("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
         return;
      case 2004:
         GameCanvas.bka.aaa(er.lba, new ca(er.dca, this, 20041, (Object)null), 0);
         return;
      case 2005:
         GameCanvas.aaa("Bạn có muốn reset mật khẩu không?", new ca(er.dca, this, 20052, (Object)null), new ca(er.cza, GameCanvas.aja, 8882, (Object)null));
         return;
      case 3000:
         aaa(false);
         GameCanvas.ama();
         return;
      case 3001:
         aaa(true);
         GameCanvas.ama();
         return;
      case 4000:
         this.aaa(this.ada.aia);
         return;
      case 4001:
         this.aaa(this.ada.aia);
         return;
      case 10021:
         this.aua = false;
         this.afa.aea = false;
         this.aea.aea = false;
         this.ada.aea = true;
         super.ana = this.ada.ava;
         super.ala = this.aya;
         return;
      case 10041:
         fd.aaa("lowGraphic", 0);
         GameCanvas.aaa(er.dja, 8885);
         return;
      case 10042:
         fd.aaa("lowGraphic", 1);
         GameCanvas.aaa(er.dja, 8885);
         return;
      case 10051:
         fd.aaa("isSoftKey", 1);
         GameScr.gsa = true;
         return;
      case 10052:
         fd.aaa("isSoftKey", 2);
         GameScr.gsa = false;
         return;
      case 10061:
         GameCanvas.ama();
         fd.aaa("indLanguage", -1);
         Class_ab.aja.notifyDestroyed();
         return;
      case 20000:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = Class_ab.aba[0];
         Class_ab.aka = Class_ab.aca[0];
         fd.aaa("indServer", Class_ab.ada[0]);
         this.ala();
         return;
      case 20001:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[1];
         Class_ab.afa = Class_ab.aba[1];
         Class_ab.aka = Class_ab.aca[1];
         fd.aaa("indServer", Class_ab.ada[1]);
         this.ala();
         return;
      case 20041:
         this.bga = GameCanvas.bka.aaa.aia.toString();
         GameCanvas.ama();
         if (this.bga.equals("")) {
            GameCanvas.aaa(er.dqa);
            return;
         }

         GameCanvas.aaa(er.dya, new ca(er.cma, this, 200421, (Object)null), new ca(er.cza, this, 200422, (Object)null));
         return;
      case 20051:
         GameScr.ava().aaa();
         return;
      case 20052:
         Class_ab.aaa("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
         return;
      case 200041:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = 14444;
         fd.aaa("indServer", Class_ab.ada[0]);
         this.ala();
         return;
      case 200042:
         GameCanvas.bea.aaa = false;
         Class_ab.aga = Class_ab.aaa[0];
         Class_ab.afa = 14444;
         fd.aaa("indServer", Class_ab.aaa[0]);
         this.ala();
         return;
      case 200421:
         GameCanvas.ama();
         String var4 = this.bga;
         Class_ab.aga = Class_ab.aaa[0];
         GameCanvas.aba(er.ena);
         GameCanvas.aca();
         GameCanvas.aba(er.bda);
         Service.aaa().aaa(var4);
         return;
      case 200422:
         String var7 = this.bga;
         GameCanvas.aaa(ex.aaa(er.qda, "#", var7));
      default:
      }
   }

   public static void aga() {
      aaa = 0;
      aba = GameCanvas.aca("/tt.png");
   }

   static {
      aa.aaa(37);
      aga();
   }

   public static void aha() {
      aha = null;
      aaa = 0;
      aba = null;
      aca = false;
   }
}
