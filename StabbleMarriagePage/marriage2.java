//import java.lang.*;
import java.io.*;
import java.util.*;

public class marriage {

	static void GaleShapley (int n, int chicaprefs[][], int chicorango[][], int prefG[], int prefB[])
	{
			   int i,b;
			   Integer a;// = new Integer(10);
			   int g;
			   Stack chicaslibres=new Stack();
			   boolean[] chicoslibres=new boolean[n];
			   int[] sigpropuesta=new int[n];
			   
			   for (i=0;i<n;i++)
			   {
			          chicoslibres[i]=true;
			          chicaslibres.push(new Integer(i));
			          sigpropuesta[i]=0;
			   }
			   while (! chicaslibres.empty())
			          {
			                   a=(Integer) chicaslibres.peek(); //consigue la cima de la pila
						 g = a.intValue();// o intVal();
			                   b=chicaprefs[g][sigpropuesta[g]];
			                   sigpropuesta[g]++;

				          if (chicoslibres[b])
				          {
		                        prefG[g]=b;
		                        prefB[b]=g;
		                        chicoslibres[b]=false;
		                        chicaslibres.pop();
		                   } 
				          else //verifica el compromiso actual de b
				          {
				        	  if (chicorango[b][g]<chicorango[b][prefB[b]])
				        	  {
		                                  chicaslibres.pop();
		                                  chicaslibres.push(new Integer(prefB[b]));
		                                  prefG[prefB[b]] = -1;
		                                  prefG[g]=b;
		                                  prefB[b]=g;
		                                  chicoslibres[b]=false;
				        	  }
				          }
		                 
			          }
			       
		}
	
		public static void main (String args[]) throws IOException
		{
			//int n, int chicaprefs[][], int chicorango[][], int prefG[], int prefB[]
			
			int nro;
			int a;
			String t;
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingresar cantidad:");
			t = b.readLine();
			nro = Integer.parseInt(t);
			
			int[][] chicasP = new int[nro][nro];
			int[][] chicosR = new int[nro][nro];
			int[] prefsH = new int[nro];
			int[] prefsM = new int[nro];
			
			for (int i = 0; i< nro; i++)
			{
				System.out.println("Chica "+i);
				System.out.println("Ingresar codigo de chico (orden de pref.) :");
				for (int j = 0; j < nro; j++)
				{
					t = b.readLine();
					a = Integer.parseInt(t);
					chicasP[i][j] = a;
				}
			}
				
			for (int h = 0; h< nro; h++)
			{
				System.out.println("Chico "+h);
				System.out.println("Ingresar ranking:");
				for (int k = 0; k < nro; k++)
				{
					System.out.println("Para la Chica "+k);
					t = b.readLine();
					a = Integer.parseInt(t);
					chicosR[h][k] = a;
				}
			}
			
			GaleShapley(nro,chicasP,chicosR,prefsH, prefsM);
			
			System.out.println("");
			System.out.println("Gale Shapley");
			for (int x = 0; x < nro; x++)
			{
				System.out.println("Chico "+x+": Su chica es la nro. "+prefsH[x]);
			}
			System.out.println("");
			for (int y = 0; y < nro; y++)
			{
				System.out.println("Chica "+y+": Su chico es el nro "+prefsM[y]);
			}
		}
	}
	

