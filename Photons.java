package com.coding.prac;
/*There are infinite number of identical photons these photons are placed into containers say nodes numbered from 1 
with the first container being the root node.

The kth node has two children i.e,left and right child numbered as 2*k and 2*k+1 respectively. When you throw a heat 
wave at a photon present at some node,it starts vibrating and producing light of intensity -1.the vibration of this 
photon affects all the other photons as well.

As you go awayfrom this node the intensity of light produced by photons at various nodes decreased by 1 with each passing node due 
to their increased distance from the photon that was hit by the light wave initially,all the photons are stable i.e, no vibration 
and hence they produce no light.

Ex1:
I/p1:1
i/p2:2

o/p:-2

explanation :the first node will produce light with intensity -1 and node 2 will produce -2 because it is the neighboring node of 1.

Ex2:
i/p1:2
i/p2:3

o/p:-3*/

public class Photons {
	public static void main(String[] args) {
		
		int src=2;
		int dst=3;
		System.out.println(photons(src, dst));
		
	}
	static int photons(int src,int dst) {
		int power=-1;
		while(src!=dst) {
			power --;
			
			if(src>dst) {
				src=src/2;
		
			}
			else {
				dst=dst/2;
			}
		}
	return	power;
		
	}

}
