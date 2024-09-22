package example.logohome.lord;

import androidx.appcompat.app.AppCompatActivity;



import android.os.Bundle;
import android.view.View;

import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener   {
Button p1 , p2 , p3 , p4 ;ImageView img ;ImageView imh ,d[] = new ImageView[6],r[] = new ImageView[4],g[] =new ImageView[4], b[] = new ImageView[4],y[] = new ImageView[4],bh[] = new ImageView[73],highlight[] = new ImageView[4];TextView winners;
int j=0;boolean o = false;ImageView h[] = new ImageView[16]; boolean ned  = false,bg[] = new boolean[4],yg[] = new boolean[4],gg[] = new boolean[4],rg[] = new boolean[4];int f = 0;boolean a = true;int bp[] = new int[4],yp[] = new int [4],gp[] = new int[4],rp[] = new int[4],bhg = 10;boolean q = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = (Button)findViewById(R.id.player1);
        p2 = (Button)findViewById(R.id.player2);
        p3 = (Button)findViewById(R.id.player3);
        p4 = (Button)findViewById(R.id.player4);
        p1.setOnClickListener(this);p2.setOnClickListener(this);p3.setOnClickListener(this);p4.setOnClickListener(this);
        img = (ImageView)findViewById(R.id.img);imh= (ImageView)findViewById(R.id.imageView);d[0] =(ImageView) findViewById(R.id.dice1);d[1] =(ImageView) findViewById(R.id.dice2);d[2] =(ImageView) findViewById(R.id.dice3);d[3] =(ImageView) findViewById(R.id.dice4);d[4] =(ImageView) findViewById(R.id.dice5);d[5] =(ImageView) findViewById(R.id.dice6);
        r[0] = findViewById(R.id.red1);r[1] = findViewById(R.id.red2);r[2] = findViewById(R.id.red3);r[3] = findViewById(R.id.red4);
        g[0] = findViewById(R.id.green1);g[1] = findViewById(R.id.green2);g[2] = findViewById(R.id.green3);g[3] = findViewById(R.id.green4);
        b[0] = findViewById(R.id.blue1);b[1] = findViewById(R.id.blue2);b[2] = findViewById(R.id.blue3);b[3] = findViewById(R.id.blue4);
        y[0]= findViewById(R.id.yellow1);y[1]= findViewById(R.id.yellow2);y[2]= findViewById(R.id.yellow3);y[3]= findViewById(R.id.yellow4);
        bh[0] = findViewById(R.id.bh1);bh[1] = findViewById(R.id.bh2);bh[2] = findViewById(R.id.bh3);bh[3] = findViewById(R.id.stopb);bh[4] = findViewById(R.id.bh4);bh[5] = findViewById(R.id.bh5);bh[6] = findViewById(R.id.bh6);bh[7] = findViewById(R.id.bh7);bh[8] = findViewById(R.id.bluestop);bh[9] = findViewById(R.id.bh8);bh[10] = findViewById(R.id.bh9);bh[11] = findViewById(R.id.bh10);bh[12] = findViewById(R.id.bh11);
        bh[52]= findViewById(R.id.bb1);bh[53]= findViewById(R.id.bb2);bh[54]= findViewById(R.id.bb2);bh[55] = findViewById(R.id.bb3);bh[56]= findViewById(R.id.bb4);bh[57]= findViewById(R.id.bb5);
        bh[13] = findViewById(R.id.yh1);bh[14] = findViewById(R.id.yh2);bh[15] = findViewById(R.id.yh3);bh[16] = findViewById(R.id.stopy);bh[17] = findViewById(R.id.yh4);bh[18] = findViewById(R.id.yh5);bh[19] = findViewById(R.id.yh6);bh[20] = findViewById(R.id.yh7);bh[21] = findViewById(R.id.yellowstop);bh[22] = findViewById(R.id.yh8);bh[23] = findViewById(R.id.yh9);bh[24] = findViewById(R.id.yh10);bh[25] =  findViewById(R.id.yh11);
        bh[26] = findViewById(R.id.gh1);bh[27] = findViewById(R.id.gh2);bh[28] = findViewById(R.id.gh3);bh[29] = findViewById(R.id.stopg);bh[30] = findViewById(R.id.gh4);bh[31] = findViewById(R.id.gh5);bh[32] = findViewById(R.id.gh6);bh[33] = findViewById(R.id.gh7);bh[34] = findViewById(R.id.greenstop);bh[35] = findViewById(R.id.gh8);bh[36] = findViewById(R.id.gh9);bh[37]=  findViewById(R.id.gh10);bh[38] = findViewById(R.id.gh11);
        bh[39] = findViewById(R.id.rh1);bh[40] = findViewById(R.id.rh2);bh[41] = findViewById(R.id.rh3);bh[42] = findViewById(R.id.stopr);bh[43] = findViewById(R.id.rh4);bh[44] = findViewById(R.id.rh5);bh[45] = findViewById(R.id.rh6);bh[46] = findViewById(R.id.rh7);bh[47] = findViewById(R.id.redstop);bh[48] =  findViewById(R.id.rh8);bh[49] = findViewById(R.id.rh9);bh[50] = findViewById(R.id.rh10);bh[51] = findViewById(R.id.rh11);
        bh[63] = findViewById(R.id.gb1);bh[64] = findViewById(R.id.gb2);bh[65] = findViewById(R.id.gb3);bh[66] = findViewById(R.id.gb4);bh[67] = findViewById(R.id.gb5);
        bh[68] = findViewById(R.id.rb1);bh[69] = findViewById(R.id.rb2);bh[70] = findViewById(R.id.rb3);bh[71] = findViewById(R.id.rb4);bh[72] = findViewById(R.id.rb5);
        bh[58] = findViewById(R.id.yb1);bh[59] = findViewById(R.id.yb2);bh[60] = findViewById(R.id.yb3);bh[61] = findViewById(R.id.yb4);bh[62] = findViewById(R.id.yb5);
        highlight[0] = findViewById(R.id.highlight1);highlight[1]=  findViewById(R.id.highlight2);highlight[2] = findViewById(R.id.highlight3);highlight[3] = findViewById(R.id.highlight4);h[0] = findViewById(R.id.hb1);h[1] = findViewById(R.id.hb2);h[2]= findViewById(R.id.hb3);h[3] = findViewById(R.id.hb4);h[4]=  findViewById(R.id.hy1);h[5] = findViewById(R.id.hy2);h[6] = findViewById(R.id.hy3);h[7] =findViewById(R.id.hy4);h[8] = findViewById(R.id.hg1);h[9] = findViewById(R.id.hg2);h[10] = findViewById(R.id.hg3);h[11] = findViewById(R.id.hg4);h[12] = findViewById(R.id.hr1);h[13] = findViewById(R.id.hr2);h[14] = findViewById(R.id.hr3);h[15] = findViewById(R.id.hr4);
winners = findViewById(R.id.win);
        for(int i =0;i<4;i++)
        {
            r[i].setOnClickListener(this);
            b[i].setOnClickListener(this);
            y[i].setOnClickListener(this);
            g[i].setOnClickListener(this);
            rp[i] = 47;
            bp[i] = 8;
            gp[i] = 34;
            yp[i] = 21;

        }
        for(int i = 0;i<6;i++)
        {
            d[i].setOnClickListener(this);
        }
        for(int i = 0;i<73;i++)
        {
            bh[i].setOnClickListener(this);
        }
    }


    public void onClick(View v) {
        int e = v.getId();
        if((e==d[0].getId()|| e==d[1].getId()||e==d[2].getId()||e==d[3].getId()||e==d[4].getId()||e==d[5].getId())&&a)
        {
            Random r = new Random();
            j = r.nextInt((5-1)+1)+1;q = true;
          Dice();
          o=true;
        }
        if(f==0){
        if(e==b[0].getId()&&ned&&!bg[0])
        {
            open();b[0].setVisibility(View.INVISIBLE);ned = false;
            for(int i =0;i<4;i++)
            h[i].setVisibility(View.INVISIBLE);
        }
        if(e==b[1].getId()&&ned &&!bg[1])
        {
            open();b[1].setVisibility(View.INVISIBLE);ned=false;
            for(int i =0;i<4;i++)
            {
                h[i].setVisibility(View.INVISIBLE);
            }
        }
        if(e==b[2].getId()&&ned&&!bg[2])
        {
            open();b[2].setVisibility(View.INVISIBLE);
            ned = false;for(int i = 0;i<4;i++)
        {
            h[i].setVisibility(View.INVISIBLE);
        }
        }
        if(e==b[3].getId()&&ned&&!bg[3])
        {
            open();b[3].setVisibility(View.INVISIBLE);
            ned=false;
            for(int i =0;i<4;i++)
            {
                h[i].setVisibility(View.INVISIBLE);
            }
        }
            if((e==bh[8].getId()||e==bh[bp[0]].getId())&&bg[0])
            {
                bhg = 0;chance();for(int i =0;i<4;i++)
                h[i].setVisibility(View.INVISIBLE);
            }if((e==bh[8].getId()||e==bh[bp[1]].getId())&&bg[1])
            {
                bhg = 1;chance();for(int i =0;i<4;i++)
                h[i].setVisibility(View.INVISIBLE);
            }
            if((e==bh[8].getId()||e==bh[bp[2]].getId())&&bg[2])
            {
                bhg = 2 ;chance();for(int i =0;i<4;i++)
                h[i].setVisibility(View.INVISIBLE);
            }
            if((e==bh[8].getId()||e==bh[bp[3]].getId())&&bg[3])
            {
                bhg =3 ; chance();for(int i =0;i<4;i++)
                h[i].setVisibility(View.INVISIBLE);
            }
        }
      else if(f==1)
        {
            if(e==y[0].getId()&&ned&&!yg[0])
            {
                open();y[0].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i =4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==y[1].getId()&&ned&&!yg[1])
            {
                open();y[1].setVisibility(View.INVISIBLE);
                ned=false;
                for(int i = 4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==y[2].getId()&&ned&&!yg[2])
            {
                open();y[2].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i=4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==y[3].getId()&&ned&&!yg[3])
            {
                open();y[3].setVisibility(View.INVISIBLE);
                ned= false;
                for(int i = 4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[21].getId()||e==bh[yp[0]].getId())&&yg[0])
            {
                bhg = 0;
                chance();for(int i = 4;i<8;i++)
            {
                h[i].setVisibility(View.INVISIBLE);
            }
            }
            if((e==bh[21].getId()||e==bh[yp[1]].getId())&&yg[1])
            {
                bhg = 1;
                chance();
                for(int i = 4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[21].getId()||e==bh[yp[2]].getId())&&yg[2])
            {
                bhg=2;chance();
                for(int i = 4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[21].getId()||e==bh[yp[3]].getId())&&yg[3])
            {
                bhg = 3;chance();
                for(int i = 4;i<8;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
        }
       else if(f==2)
        {
            if(e==g[0].getId()&&ned&&!gg[0])
            {
                open();g[0].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==g[1].getId()&&ned&&!gg[1])
            {
                open();g[1].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i = 8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==g[2].getId()&&ned&&!gg[2])
            {
                open();g[2].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i = 8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==g[3].getId()&&ned&&!gg[3])
            {
                open();g[3].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[34].getId()||e==bh[gp[0]].getId())&&gg[0])
            {
                bhg = 0; chance();
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[34].getId()||e==bh[gp[1]].getId())&&gg[1])
            {
                bhg = 1;chance();
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[34].getId()||e==bh[gp[2]].getId())&&gg[2])
            {
                bhg =2 ;chance();
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if((e==bh[34].getId()||e==bh[gp[3]].getId())&&gg[3])
            {
                bhg = 3; chance();
                for(int i =8;i<12;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }

        }
        else         {
            if(e==r[0].getId()&&ned&&!rg[0])
            {
                open();r[0].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i=12;i<16;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==r[1].getId()&&ned&&!rg[1])
            {
                open();r[1].setVisibility(View.INVISIBLE);
                ned = false;
                for(int i=12;i<16;i++)
                {
                    h[i].setVisibility(View.INVISIBLE);
                }
            }
            if(e==r[2].getId()&&ned&&!rg[2])
        {
            open();r[2].setVisibility(View.INVISIBLE);
            ned = false;
            for(int i=12;i<16;i++)
            {
                h[i].setVisibility(View.INVISIBLE);
            }
        }
             if(e==r[3].getId()&&ned&&!rg[3])
        {
            open();r[3].setVisibility(View.INVISIBLE);
            ned = false;
            for(int i=12;i<16;i++)
            {
                h[i].setVisibility(View.INVISIBLE);
            }
        }

             if((e==bh[47].getId()||e==bh[rp[0]].getId())&&rg[0])
             {
               bhg = 0;
               chance();
                 for(int i=12;i<16;i++)
                 {
                     h[i].setVisibility(View.INVISIBLE);
                 }
             }
             if((e==bh[47].getId()||e==bh[rp[1]].getId())&&rg[1])
             {
                 bhg=1;chance();
                 for(int i=12;i<16;i++)
                 {
                     h[i].setVisibility(View.INVISIBLE);
                 }
             }
             if((e==bh[47].getId()||e==bh[rp[2]].getId())&&rg[2])
             {
                 bhg = 2;chance();
                 for(int i=12;i<16;i++)
                 {
                     h[i].setVisibility(View.INVISIBLE);
                 }
             }
             if((e==bh[47].getId()||e==bh[rp[3]].getId())&&rg[3])
             {
             bhg = 3;chance();
                 for(int i=12;i<16;i++)
                 {
                     h[i].setVisibility(View.INVISIBLE);
                 }
             }

        }
        if(e== p4.getId())
        {
            highlight[0].setVisibility(View.VISIBLE);
            img.setVisibility(View.VISIBLE);
            p1.setVisibility(View.INVISIBLE);
            p2.setVisibility(View.INVISIBLE);
            p3.setVisibility(View.INVISIBLE);d[5].setVisibility(View.VISIBLE);
            p4.setVisibility(View.INVISIBLE);
            for(int i =0;i<4;i++)
        {

            r[i].setVisibility(View.VISIBLE);
            g[i].setVisibility(View.VISIBLE);
            y[i].setVisibility(View.VISIBLE);
            b[i].setVisibility(View.VISIBLE);

        }
        for(int i = 0; i<=72;i++)
        {
            bh[i].setVisibility(View.VISIBLE);
        }

                    imh.setVisibility(View.INVISIBLE);player4();
        }

        if(e==p3.getId())
        {
            img.setVisibility(View.VISIBLE);
            p1.setVisibility(View.INVISIBLE);
            p2.setVisibility(View.INVISIBLE);
            p3.setVisibility(View.INVISIBLE);d[5].setVisibility(View.VISIBLE);
            p4.setVisibility(View.INVISIBLE);for(int i =0;i<4;i++)
        {


            r[i].setVisibility(View.VISIBLE);
            g[i].setVisibility(View.VISIBLE);
            y[i].setVisibility(View.VISIBLE);
            b[i].setVisibility(View.VISIBLE);

        }
            for(int i = 0; i<=72;i++)
            {
                bh[i].setVisibility(View.VISIBLE);
            }

            imh.setVisibility(View.INVISIBLE);player3();
        }
        if(e== p2.getId())
        {
            img.setVisibility(View.VISIBLE);
            p1.setVisibility(View.INVISIBLE);
            p2.setVisibility(View.INVISIBLE);
            p3.setVisibility(View.INVISIBLE);d[5].setVisibility(View.VISIBLE);
            p4.setVisibility(View.INVISIBLE);for(int i =0;i<4;i++)
        {


            r[i].setVisibility(View.VISIBLE);
            g[i].setVisibility(View.VISIBLE);
            y[i].setVisibility(View.VISIBLE);
            b[i].setVisibility(View.VISIBLE);

        }
        for(int i = 0; i<=72;i++)
        {
            bh[i].setVisibility(View.VISIBLE);
        }

            imh.setVisibility(View.INVISIBLE);player2();
        }
        if(e==p1.getId())
        {
            img.setVisibility(View.VISIBLE);
            p1.setVisibility(View.INVISIBLE);
            p2.setVisibility(View.INVISIBLE);
            p3.setVisibility(View.INVISIBLE);d[5].setVisibility(View.VISIBLE);
            p4.setVisibility(View.INVISIBLE);for(int i =0;i<4;i++)
        {


            r[i].setVisibility(View.VISIBLE);
            g[i].setVisibility(View.VISIBLE);
            y[i].setVisibility(View.VISIBLE);
            b[i].setVisibility(View.VISIBLE);

        }
            for(int i = 0; i<=72;i++)
            {
                bh[i].setVisibility(View.VISIBLE);
            }

            imh.setVisibility(View.INVISIBLE);player1();
        }
        for(int i = 0;i<4;i++)
        {
        if(b[i].getVisibility()==View.INVISIBLE)

        {
            bg[i] = true;
        }
        else
        {
            bg[i] = false;
        }
        if(r[i].getVisibility()==View.INVISIBLE)
        {
            rg[i]=true;
        }
        else {
            rg[i] = false;
        }
        if(g[i].getVisibility()==View.INVISIBLE)
        {
            gg[i] = true;
        }
        else
            gg[i]= false;
        if(y[i].getVisibility()==View.INVISIBLE)
            yg[i] = true;
        else
            yg[i] = false ;
        }player4();
    }
    public void player4()
    {a=true;

         if(o)
         {o = false;
            if(j==5)
            {
                choice();ned = true;
            }
            else{
                if(f==0){
                highlight[f].setVisibility(View.VISIBLE);
highlight[3].setVisibility(View.INVISIBLE);
                }
            else if (f==1){
                highlight[f].setVisibility(View.VISIBLE);
highlight[f-1].setVisibility(View.INVISIBLE);
            }
            else if(f==2){
                highlight[f].setVisibility(View.VISIBLE);highlight[f-1].setVisibility(View.INVISIBLE);
            }
            else if(f==3){
                highlight[f].setVisibility(View.VISIBLE);highlight[f-1].setVisibility(View.INVISIBLE);
            }
for(int fg=0;fg <4;fg++ )
{if(fg!=f)
    highlight[fg].setVisibility(View.INVISIBLE);
}
            }
         if(f>3)
             f=0;
         }
    }
    public void player3()
    {
        highlight[0].setVisibility(View.VISIBLE);
    }
    public void player2()
    {
        highlight[0].setVisibility(View.VISIBLE);
    }
    public void player1()
    {
        highlight[0].setVisibility(View.VISIBLE);
    }
    public void Dice()
    {
        d[j].setVisibility(View.VISIBLE);
        for(int i = 0;i<6;i++)
        {
            if(i!=j)
            {
            d[i].setVisibility(View.INVISIBLE);
            }
        }

        if(f<=3){

            f++;
            }
        if(f>3)
        {
            f=0;
        }

        player4();
    }
    public void choice()
    {

        a=false;

         if(f==1)
        {
            for(int i = 4;i<8;i++)
            {
                h[i].setVisibility(View.VISIBLE);
            }
        }
        else if (f==2)
        {
            for(int i = 8;i<12;i++)
            {
                h[i].setVisibility(View.VISIBLE);
            }
        }
        else if(f==3)
        {
            for(int i =12;i<16;i++)
            {
                h[i].setVisibility(View.VISIBLE);
            }
        }
         else {
             for (int i = 0; i < 4; i++) {
                 h[i].setVisibility(View.VISIBLE);
             }
         }

    }
    public void open()
    {a=false;q = false;
        if(f==0)
        bh[8].setImageResource(R.drawable.blue);
        else if(f==1)
            bh[21].setImageResource(R.drawable.yellow);
        else if(f==2)
            bh[34].setImageResource(R.drawable.green);
        else if(f==3)
            bh[47].setImageResource(R.drawable.red);
a = true;
    }
    public void chance()
    {
        if(q){
            q = false;
            if(f>=3){
            if(rg[bhg]&&rp[bhg]==47)
            {rp[bhg] =47;

                for(int hgf=0;hgf<=j;hgf++)
                {
                    bh[47].setImageResource(R.drawable.redstop);
                    bh[rp[bhg]].setImageResource(R.drawable.block);
                    for(int a =0;a<4;a++)
                    {
                        if(a!=bhg)
                        {
                            if(rp[a]==rp[bhg]&&rg[a])
                            {
                                bh[rp[bhg]].setImageResource(R.drawable.red);
                            }
                        }
                        if(rp[bhg]==bp[a]&&bg[a])
                        {
                            bh[bp[a]].setImageResource(R.drawable.blue);
                        }
                        if(rp[bhg]==gp[a]&&gg[a])
                        {
                            bh[gp[a]].setImageResource(R.drawable.green);
                        }
                        if(rp[bhg]==yp[a]&&yg[a])
                        {
                            bh[yp[a]].setImageResource(R.drawable.yellow);
                        }
                    }
                    rp[bhg]++;
                    if (rp[bhg] == 51)
                        rp[bhg] = 0;

                    bh[rp[bhg]].setImageResource(R.drawable.red);
                }

            }Rloop:
            if(rg[bhg]&&bh[rp[bhg]].isPressed()&&rp[bhg]!=47)
            {
                for(int hgf = 0;hgf<=j;hgf++)
                {
                    bh[rp[bhg]].setImageResource(R.drawable.block);

                    if (rp[bhg]==3||rp[bhg]==29||rp[bhg]==16||rp[bhg]==42)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.stop);
                    }
                    if(rp[bhg]==68||rp[bhg]==69||rp[bhg]==70||rp[bhg]==72||rp[bhg]==71)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.redbloc);
                    }
                    if(rp[bhg]==47)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.redstop);
                    }
                    else if(rp[bhg]==34)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.greenstop);
                    }
                    else if(rp[bhg]==21)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.yellowstop);
                    }
                    else if (rp[bhg]==8)
                    {
                        bh[rp[bhg]].setImageResource(R.drawable.bluestop);
                    }for(int a =0;a<4;a++)
                {
                    if(a!=bhg)
                    {
                        if(rp[a]==rp[bhg]&&rg[a])
                        {
                            bh[rp[bhg]].setImageResource(R.drawable.red);
                        }

                    }
                    if(rp[bhg]==bp[a]&&bg[a])
                    {
                        bh[bp[a]].setImageResource(R.drawable.blue);
                    }
                    if(rp[bhg]==gp[a]&&gg[a])
                    {
                        bh[gp[a]].setImageResource(R.drawable.green);
                    }
                    if(rp[bhg]==yp[a]&&yg[a])
                    {
                        bh[yp[a]].setImageResource(R.drawable.yellow);
                    }
                }
                    if(rp[bhg]==45)
                    {
                        rp[bhg]=68;
                    }


                    for(int a = 0;a<4;a++)
                    {
                        if(rp[bhg]==16||rp[bhg]==42||rp[bhg]==3||rp[bhg]==47||rp[bhg]==21||rp[bhg]==8||rp[bhg]==29||rp[bhg]==34)
                        {
                            if(rp[bhg]==bp[a]&&bg[a])
                            {
                                bh[rp[bhg]].setImageResource(R.drawable.blue);
                            }
                            if(rp[bhg]==yp[a]&&yg[a])
                            {
                                bh[rp[bhg]].setImageResource(R.drawable.yellow);
                            }
                            if(rp[bhg]==gp[a]&&gg[a])
                            {
                                bh[rp[bhg]].setImageResource(R.drawable.green);
                            }
                        }
                    }
                    if(rp[bhg]==51)
                    {
                        rp[bhg]=0;
                    }
                    rp[bhg]++;
                    if(rp[bhg]>=72)
                    {
                      rp[bhg]=72;  q=true;break Rloop;
                    }

                    bh[rp[bhg]].setImageResource(R.drawable.red);
                }

            }
                if(rp[bhg]>=72)
                {

                    win();
                }
    bhg = 1;
    for(int a = 0;a<4;a++)
    {if(!(rp[bhg]==16||rp[bhg]==42||rp[bhg]==3||rp[bhg]==47||rp[bhg]==21||rp[bhg]==8||rp[bhg]==29||rp[bhg]==34)) {
        if (rp[bhg] == yp[a] && yg[a]) {
            y[a].setVisibility(View.VISIBLE);
            yp[a] = 21;
            yg[a] = false;
        }
        if (rp[bhg] == gp[a] && gg[a]) {
            g[a].setVisibility(View.VISIBLE);
            gp[a] = 34;
            gg[a] = false;
        }
        if (rp[bhg] == bp[a] && bg[a]) {
            b[a].setVisibility(View.VISIBLE);
            bp[a] = 8;
            bg[a] = false;
        }
    }
    }
}
BLUE:
            if(f==0){
                BLOOP:
            if(bg[bhg]&&bh[bp[bhg]].isPressed())
            {
                for(int hgf = 0;hgf<=j;hgf++)
                {
                    bh[bp[bhg]].setImageResource(R.drawable.block);
                    if(bp[bhg]==16||bp[bhg]==29||bp[bhg]==42||bp[bhg]==3)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.stop);
                    }
                   if(bp[bhg]==52||bp[bhg]==53||bp[bhg]==54||bp[bhg]==55||bp[bhg]==57||bp[bhg]==56)
                   {
                       bh[bp[bhg]].setImageResource(R.drawable.bluebloc);
                   }
                    if(bp[bhg]==47)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.redstop);
                    }
                    else if(bp[bhg]==34)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.greenstop);
                    }
                    else if(bp[bhg]==21)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.yellowstop);
                    }
                    else if (bp[bhg]==8)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.bluestop);
                    }for(int a =0;a<4;a++)
                {
                    if(a!=bhg)
                    {
                        if(bp[a]==bp[bhg]&&bg[a])
                        {
                            bh[bp[bhg]].setImageResource(R.drawable.blue);
                        }

                    }
                    if(bp[bhg]==yp[a]&&yg[a])
                    {
                        bh[yp[a]].setImageResource(R.drawable.yellow);
                    }
                    if(bp[bhg]==rp[a]&&rg[a])
                    {
                        bh[rp[a]].setImageResource(R.drawable.red);
                    }
                    if(bp[bhg]==gp[a]&&gg[a])
                    {
                        bh[gp[a]].setImageResource(R.drawable.green);
                    }
                }

                    bp[bhg]++;
                    if(bp[bhg]==7)
                    {
                        bp[bhg] = 52;
                        bh[bp[bhg]].setImageResource(R.drawable.blue);

                    }
                    if(bp[bhg]>=57)
                    {
                        bp[bhg]= 57;bh[58].setImageResource(R.drawable.yellowbloc);
                    }

                    if(bp[bhg]==51)
                    {
                        bp[bhg] = 0;
                    }
                 for(int a = 0;a<4;a++)
                 {
                     if(bp[bhg]==16||bp[bhg]==42||bp[bhg]==3||bp[bhg]==47||bp[bhg]==21||bp[bhg]==8||bp[bhg]==29||bp[bhg]==34)
                     {
                         if(bp[bhg]==rp[a]&&rg[a])
                         {
                             bh[bp[bhg]].setImageResource(R.drawable.red);
                         }
                         if(bp[bhg]==gp[a]&&gg[a])
                         {
                             bh[bp[bhg]].setImageResource(R.drawable.green);
                         }
                         if(bp[bhg]==yp[a]&&yg[a])
                         {
                             bh[bp[bhg]].setImageResource(R.drawable.yellow);
                         }
                     }
                 }


                    bh[bp[bhg]].setImageResource(R.drawable.blue);
                }
                if(bp[bhg]>=57)
                {
                    bh[58].setImageResource(R.drawable.yellowbloc);
                    win();
                }
            }
            if(bg[bhg]&&bp[bhg]==8)
            {bp[bhg] = 8;
                for(int hgf= 0;hgf<=j;hgf++)
                {
                    bh[bp[bhg]].setImageResource(R.drawable.block);for(int a =0;a<4;a++)
                {
                    if(a!=bhg)
                    {
                        if(bp[a]==bp[bhg]&&bg[a])
                        {
                            bh[bp[bhg]].setImageResource(R.drawable.blue);
                        }
                    }
                    if(bp[bhg]==yp[a]&&yg[a])
                    {
                        bh[yp[a]].setImageResource(R.drawable.yellow);
                    }
                    if(bp[bhg]==rp[a]&&rg[a])
                    {
                        bh[rp[a]].setImageResource(R.drawable.red);
                    }
                    if(bp[bhg]==gp[a]&&gg[a])
                    {
                        bh[gp[a]].setImageResource(R.drawable.green);
                    }
                }
                    if(bp[bhg]==8)
                    {
                        bh[bp[bhg]].setImageResource(R.drawable.bluestop);
                    }
                    bp[bhg]++;
                    bh[bp[bhg]].setImageResource(R.drawable.blue);

                }

            }bhg = 1;
                for(int a = 0;a<4;a++)
                {
                    if (!(bp[bhg]==16||bp[bhg]==42||bp[bhg]==3||bp[bhg]==47||bp[bhg]==21||bp[bhg]==8||bp[bhg]==29||bp[bhg]==34)) {
                        if (bp[bhg] == yp[a]) {
                            y[a].setVisibility(View.VISIBLE);
                            yp[a] = 21;
                            yg[a] = false;
                        }
                        if (bp[bhg] == gp[a]) {
                            g[a].setVisibility(View.VISIBLE);
                            gg[a] = false;
                            gp[a] = 34;
                        }
                        if (bp[bhg] == rp[a]) {
                            r[a].setVisibility(View.VISIBLE);
                            rp[a] = 47;
                            rg[a] = false;
                        }
                    }
                }
            }
            if(f==1)
            {
                if(yg[bhg]&&yp[bhg]==21)
                {
                    yp[bhg]=21;
                    for(int hgf =0 ;hgf <=j;hgf++)
                    {bh[yp[bhg]].setImageResource(R.drawable.block);
                        for(int a =0;a<4;a++)
                        {
                            if(a!=bhg)
                            {
                                if(yp[a]==yp[bhg]&&yg[a])
                                {
                                    bh[yp[bhg]].setImageResource(R.drawable.yellow);
                                }
                            }
                            if(yp[bhg]==rp[a]&&rg[a])
                            {
                                bh[rp[a]].setImageResource(R.drawable.red);
                            }
                            if(yp[bhg]==bp[a]&&bg[a])
                            {
                                bh[bp[a]].setImageResource(R.drawable.blue);
                            }
                            if(yp[bhg]==gp[a]&&gg[a])
                            {
                                bh[gp[a]].setImageResource(R.drawable.green);
                            }
                        }

                        if(yp[bhg]==21)
                        {
                            bh[yp[bhg]].setImageResource(R.drawable.yellowstop);
                        }yp[bhg]++;
                        bh[yp[bhg]].setImageResource(R.drawable.yellow);

                    }

                }
                if(yg[bhg]&&bh[yp[bhg]].isPressed())
                {YLOOP:
                    for(int hgf = 0;hgf<=j;hgf++){


                    if(yp[bhg]==16||yp[bhg]==29||yp[bhg]==42||yp[bhg]==3)
                    {
                        bh[yp[bhg]].setImageResource(R.drawable.stop);
                    }
                    else if(yp[bhg]==58||yp[bhg]==59||yp[bhg]==60||yp[bhg]==62||yp[bhg]==61)
                        {
                            bh[yp[bhg]].setImageResource(R.drawable.yellowbloc);
                        }
                    else  if(yp[bhg]==47)
                    {
                        bh[yp[bhg]].setImageResource(R.drawable.redstop);
                    }
                    else if(yp[bhg]==34)
                    {
                        bh[yp[bhg]].setImageResource(R.drawable.greenstop);
                    }
                    else if(yp[bhg]==21)
                    {
                        bh[yp[bhg]].setImageResource(R.drawable.yellowstop);
                    }
                    else if (yp[bhg]==8)
                    {
                        bh[yp[bhg]].setImageResource(R.drawable.bluestop);
                    }
                    else{
                        bh[yp[bhg]].setImageResource(R.drawable.block);}
                        for(int a =0;a<4;a++)
                        {
                            if(a!=bhg)
                            {
                                if(yp[a]==yp[bhg]&&yg[a])
                                {
                                    bh[yp[bhg]].setImageResource(R.drawable.yellow);
                                }

                            }
                            if(yp[bhg]==rp[a]&&rg[a])
                            {
                                bh[rp[a]].setImageResource(R.drawable.red);
                            }
                            if(yp[bhg]==bp[a]&&bg[a])
                            {
                                bh[bp[a]].setImageResource(R.drawable.blue);
                            }
                            if(yp[bhg]==gp[a]&&gg[a])
                            {
                                bh[gp[a]].setImageResource(R.drawable.green);
                            }}
                        for(int a = 0; a<4;a++)
                        {
                            if(yp[bhg]==16||yp[bhg]==42||yp[bhg]==3||yp[bhg]==47||yp[bhg]==21||yp[bhg]==8||yp[bhg]==29||yp[bhg]==34)
                            {
                                if(yp[bhg]==gp[a]&&gg[a])
                                {
                                    bh[yp[bhg]].setImageResource(R.drawable.green);
                                }
                                if(yp[bhg]==rp[a]&&rg[a])
                                {
                                    bh[yp[bhg]].setImageResource(R.drawable.red);
                                }
                                if(yp[bhg]==bp[a]&&bg[a])
                                {
                                    bh[yp[bhg]].setImageResource(R.drawable.blue);
                                }
                            }
                        }
                    yp[bhg]++;
                        if(yp[bhg]==19)
                        {
                           yp[bhg] =58;bh[yp[bhg]].setImageResource(R.drawable.yellow);
                        }
                        if(yp[bhg]>=62)
                        {
                           yp[bhg]= 62;break YLOOP;
                        }
                    if(yp[bhg]==51)
                    {
                       yp[bhg]=0;
                    }
                    bh[yp[bhg]].setImageResource(R.drawable.yellow);
                }
                    if(yp[bhg]==62)
                    {
                        bh[63].setImageResource(R.drawable.greenbloc);
                        win();
                    }

                }bhg = 1;
                for (int a = 0;a<4;a++)
                {
                    if(!(yp[bhg]==16||yp[bhg]==42||yp[bhg]==3||yp[bhg]==47||yp[bhg]==21||yp[bhg]==8||yp[bhg]==29||yp[bhg]==34))
                    {
                        if(yp[bhg]==rp[a])
                        {
                            r[a].setVisibility(View.VISIBLE);
                            rp[a] = 47;
                            rg[a] =false;
                        }
                        if(yp[bhg]==gp[a])
                        {
                            g[a].setVisibility(View.VISIBLE);
                            gp[a] = 34;
                            gg[a] = false;
                        }
                        if(yp[bhg]==bp[a])
                        {
                            b[a].setVisibility(View.VISIBLE);
                            bp[a] = 8;
                            bg[a] = false;
                        }
                    }
                }
            }
            if(f==2)
            {
                if(gg[bhg]&&gp[bhg]==34)
                {
                    gp[bhg] = 34;
                    for(int hgf =0;hgf <=j;hgf++)
                    {
                        bh[gp[bhg]].setImageResource(R.drawable.block);
                        for(int a =0;a<4;a++)
                        {
                            if(a!=bhg)
                            {
                                if(gp[a]==gp[bhg]&&gg[a])
                                {
                                    bh[gp[bhg]].setImageResource(R.drawable.green);
                                }
                                if(gp[bhg]==rp[a]&&rg[a])
                                {
                                    bh[rp[a]].setImageResource(R.drawable.red);
                                }
                                if(gp[bhg]==bp[a]&&bg[a])
                                {
                                    bh[bp[a]].setImageResource(R.drawable.blue);
                                }
                                if(gp[bhg]==yp[a]&&yg[a])
                                {
                                    bh[yp[a]].setImageResource(R.drawable.yellow);
                                }
                            }
                        }
                        if(gp[bhg]==34)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.greenstop);
                        }
                        gp[bhg]++;
                        bh[gp[bhg]].setImageResource(R.drawable.green);
                    }
                    for(int a=0;a<4;a++)
                    {
                        if(gp[bhg]==yp[a])
                        {

                            y[a].setVisibility(View.VISIBLE);
                            yp[a] = 21;
                            yg[a] = false;
                        }
                        if(gp[bhg]==bp[a])
                        {
                            b[a].setVisibility(View.VISIBLE);
                            bp[a]=8;
                            bg[a] = false;
                        }
                        if(gp[bhg]==rp[a])
                        {
                            r[a].setVisibility(View.VISIBLE);
                            rp[a] = 47;
                            rg[a] = false;
                        }
                    }
                }
                if(gg[bhg]&&bh[gp[bhg]].isPressed())
                {Gloop:
                    for(int hgf=0;hgf<=j;hgf++)
                    {
                        if(gp[bhg]==16||gp[bhg]==29||gp[bhg]==42||gp[bhg]==3)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.stop);
                        }
                        else if(gp[bhg]==63||gp[bhg]==64||gp[bhg]==65||gp[bhg]==67||gp[bhg]==66)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.greenbloc);
                        }
                        else   if(gp[bhg]==47)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.redstop);
                        }
                        else if(gp[bhg]==34)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.greenstop);
                        }
                        else if(gp[bhg]==21)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.yellowstop);
                        }
                        else if (gp[bhg]==8)
                        {
                            bh[gp[bhg]].setImageResource(R.drawable.bluestop);
                        }else{
                            bh[gp[bhg]].setImageResource(R.drawable.block);}
                        for(int a =0;a<4;a++)
                        {
                            if(a!=bhg)
                            {
                                if(gp[a]==gp[bhg]&&gg[a])
                                {
                                    bh[gp[bhg]].setImageResource(R.drawable.green);
                                }
                            }
                            if(gp[bhg]==rp[a]&&rg[a])
                            {
                                bh[rp[a]].setImageResource(R.drawable.red);
                            }
                            if(gp[bhg]==bp[a]&&bg[a])
                            {
                                bh[bp[a]].setImageResource(R.drawable.blue);
                            }
                            if(gp[bhg]==yp[a]&&yg[a])
                            {
                                bh[yp[a]].setImageResource(R.drawable.yellow);
                            }
                        }

                        for(int a=0;a<4;a++)
                        {

                            if(gp[bhg]==16||gp[bhg]==42||gp[bhg]==3||gp[bhg]==47||gp[bhg]==21||gp[bhg]==8||gp[bhg]==29||gp[bhg]==34)
                            {
                                if(gp[bhg]==bp[a]&&bg[a])
                                {
                                    bh[gp[bhg]].setImageResource(R.drawable.blue);
                                }
                                if(gp[bhg]==rp[a]&&rg[a])
                                {
                                    bh[gp[bhg]].setImageResource(R.drawable.red);
                                }
                                if(gp[bhg]==yp[a]&&yg[a])
                                {
                                    bh[gp[bhg]].setImageResource(R.drawable.yellow);
                                }
                            }
                        }if(gp[bhg]==32)
                    {
                        gp[bhg] = 63;
                    }

                        gp[bhg]++;

                        if(gp[bhg]>=67)
                        {
                            q = true;break Gloop;
                        }
                        if(gp[bhg]==51)
                        {
                            gp[bhg]=0;
                        }
                        bh[gp[bhg]].setImageResource(R.drawable.green);

                    }
                    Loop:
                    for(int a = 0;a<4;a++)
                    {
                        if(!(gp[bhg]==16||gp[bhg]==42||gp[bhg]==3||gp[bhg]==47||gp[bhg]==21||gp[bhg]==8||gp[bhg]==29||gp[bhg]==34)){
                            if(gp[bhg]==yp[a])
                            {

                                y[a].setVisibility(View.VISIBLE);
                                yp[a] = 21;
                                yg[a] = false;
                            }
                            if(gp[bhg]==bp[a])
                            {
                                b[a].setVisibility(View.VISIBLE);
                                bp[a]=8;
                                bg[a] = false;
                            }
                            if(gp[bhg]==rp[a])
                            {
                                r[a].setVisibility(View.VISIBLE);
                                rp[a] = 47;
                                rg[a] = false;
                            }}
                    }
                    if(gp[bhg]==67)
                    {
                        bh[68].setImageResource(R.drawable.redbloc);
                        win();
                    }
                }

                bhg = 1;
            }}
a = true;player4();
    }
    public void win()
    {int dgh[] =new int [4];

        if(f>=3)
        {
            for(int a =0;a<4;a++)
            {
                if(rp[a]>72)
                {
                    dgh[3]++;
                }}
                if(dgh[3]>=4)
                {
                    for(int df = 0;df<=72;df++)
                    {
                        bh[df].setVisibility(View.INVISIBLE);
                    }
                    for(int k=0;k<4;k++)
                    {
                        b[k].setVisibility(View.INVISIBLE);
                        g[k].setVisibility(View.INVISIBLE);
                        r[k].setVisibility(View.INVISIBLE);
                        y[k].setVisibility(View.INVISIBLE);
                        highlight[k].setVisibility(View.INVISIBLE);
                    }
                    for(int k=0;k<6;k++)
                    {
                        d[k].setVisibility(View.INVISIBLE);
                    }
                    img.setVisibility(View.INVISIBLE);
                    highlight[3].setVisibility(View.VISIBLE);
                    winners.setVisibility(View.VISIBLE);
                    winners.setText("Red is the winner");
                }

        }
        if(f==0)
        {
            for(int a = 0;a<4;a++)
            {
                if(bp[a]>=57)
                {
                    dgh[0]++;
                }
                if(dgh[0]>=4)
                {
                    for(int df = 0;df<=72;df++)
                    {
                        bh[df].setVisibility(View.INVISIBLE);
                    }
                    img.setVisibility(View.INVISIBLE);
                    for(int k=0;k<4;k++)
                    {
                        b[k].setVisibility(View.INVISIBLE);
                        g[k].setVisibility(View.INVISIBLE);
                        r[k].setVisibility(View.INVISIBLE);
                        y[k].setVisibility(View.INVISIBLE);
                        highlight[k].setVisibility(View.INVISIBLE);
                    }
                    for(int k=0;k<6;k++)
                    {
                        d[k].setVisibility(View.INVISIBLE);
                    }
                    highlight[0].setVisibility(View.VISIBLE);
                    winners.setVisibility(View.VISIBLE);
                    winners.setText("Blue is the winner");
                }

            }
        }
        if(f==1)
        {
            for(int a = 0;a<4;a++)
            {
                if(yp[a]>=62)
                {
                    dgh[1]++;
                }
                if(dgh[1]>=4)
                {
                    for(int df = 0;df<=72;df++)
                    {
                        bh[df].setVisibility(View.INVISIBLE);
                    }
                    img.setVisibility(View.INVISIBLE);
                    for(int k=0;k<4;k++)
                    {
                        b[k].setVisibility(View.INVISIBLE);
                        g[k].setVisibility(View.INVISIBLE);
                        r[k].setVisibility(View.INVISIBLE);
                        y[k].setVisibility(View.INVISIBLE);
                        highlight[k].setVisibility(View.INVISIBLE);
                    }
                    for(int k=0;k<6;k++)
                    {
                        d[k].setVisibility(View.INVISIBLE);
                    }
                    highlight[1].setVisibility(View.VISIBLE);
                    winners.setVisibility(View.VISIBLE);
                    winners.setText("Yellow is the winner");
                }
            }
        }
        if(f==2)
        {
            for(int a = 0;a<4;a++)
            {
                if(gp[a]>=67)
                {
                    dgh[2]++;
                }
                if(dgh[2]>=4)
                {
                    for(int df = 0;df<=72;df++)
                    {
                        bh[df].setVisibility(View.INVISIBLE);
                    }
                    img.setVisibility(View.INVISIBLE);
                    for(int k=0;k<4;k++)
                    {
                        b[k].setVisibility(View.INVISIBLE);
                        g[k].setVisibility(View.INVISIBLE);
                        r[k].setVisibility(View.INVISIBLE);
                        y[k].setVisibility(View.INVISIBLE);
                        highlight[k].setVisibility(View.INVISIBLE);
                    }
                    for(int k=0;k<6;k++)
                    {
                        d[k].setVisibility(View.INVISIBLE);
                    }
                    highlight[2].setVisibility(View.VISIBLE);
                    winners.setVisibility(View.VISIBLE);
                    winners.setText("Green is the winner");
                }
            }
        }
    }
}