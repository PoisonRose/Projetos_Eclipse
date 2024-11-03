package main;

public class Main {

	public static void main(String[] args) {
		Type normal = new Type();
		normal.weakness = new float[] {1,1,1,1,1,1,2,1,1,1,1,1,1   ,0,1,1,1   ,1};
		normal.strength = new float[] {1,1,1,1,1,1,1,1,1,1,1,1,0.5f,0,1,1,0.5f,1};
		
		Type fire = new Type();
		fire.weakness = new float[] {1,0.5f,2   ,1,0.5f,0.5f,1,1,2,1,1,0.5f,2   ,1,1   ,1,0.5f,0.5f};
		fire.strength = new float[] {1,0.5f,0.5f,1,2   ,2   ,1,1,1,1,1,2   ,0.5f,1,0.5f,1,2   ,1   };

		Type water = new Type();
		water.weakness = new float[] {1,0.5f,0.5f,2,2   ,0.5f,1,1,1,1,1,1,1,1,1   ,1,0.5f,1};
		water.strength = new float[] {1,2   ,0.5f,1,0.5f,1   ,1,1,2,1,1,1,2,1,0.5f,1,1   ,1};
		
		Type electric = new Type();
		electric.weakness = new float[] {1,1,1,0.5f,1   ,1,1,1,2,0.5f,1,1,1,1,1   ,1,0.5f,1};
		electric.strength = new float[] {1,1,2,0.5f,0.5f,1,1,1,0,2   ,1,1,1,1,0.5f,1,1   ,1};
		
		Type grass = new Type();
		grass.weakness = new float[] {1,2   ,0.5f,0.5f,0.5f,2,1,2,0.5f,2,1,2,1,1,1,1,1   ,1};
		grass.strength = new float[] {1,0.5f,2   ,1   ,0.5f,1,1,2,2   ,1,1,1,1,2,1,1,0.5f,1};
		
		Type ice = new Type();
		ice.weakness = new float[] {1,2   ,1   ,1,1,0.5f,2,1,1,1,1,1,2,1,1,1,2   ,1};
		ice.strength = new float[] {1,0.5f,0.5f,1,2,0.5f,1,1,2,2,1,1,1,1,2,1,0.5f,1};
		
		Type fighting = new Type();
		fighting.weakness = new float[] {1,1,1,1,1,1,1,1   ,1,2   ,2   ,0.5f,0.5f,1,1,0.5f,1,   2};
		fighting.strength = new float[] {2,1,1,1,1,2,1,0.5f,1,0.5f,0.5f,0.5f,2   ,0,1,   2,2,0.5f};
		
		Type poison = new Type();
		poison.weakness = new float[] {1,1,1,1,0.5f,1,0.5f,0.5f,   2,1,2,0.5f,1   ,1   ,1,1,1,0.5f};
		poison.strength = new float[] {1,1,1,1,2   ,1,1   ,0.5f,0.5f,1,1,1   ,0.5f,0.5f,1,1,0,2   };
		
		Type ground = new Type();
		ground.weakness = new float[] {1,1,2,0,2   ,2,1,0.5f,1,1,1,   1,0.5f,1,1,1,1,1};
		ground.strength = new float[] {1,2,1,2,0.5f,1,1,   2,1,0,1,0.5f,   2,1,1,1,2,1};
		
		Type flying = new Type();
		flying.weakness = new float[] {1,1,1,   2,0.5f,2,0.5f,1,0,1,1,0.5f,2   ,1,1,1,1   ,1};
		flying.strength = new float[] {1,1,1,0.5f,   2,1,2   ,1,1,1,1,2   ,0.5f,1,1,1,0.5f,1};
		
		Type psychic = new Type();
		psychic.weakness = new float[] {1,1,1,1,1,1,0.5f,1,1,1,0.5f,2,1,1,1,1,1   ,1};
		psychic.strength = new float[] {1,1,1,1,1,1,2   ,2,1,1,0.5f,1,1,1,1,0,0.5f,1};
		
		Type bug = new Type();
		bug.weakness = new float[] {1,2   ,1,1,0.5f,1,0.5f,1   ,0.5f,2   ,1,1,2,1   ,1,1,1   ,1   };
		bug.strength = new float[] {1,0.5f,1,1,2   ,1,0.5f,0.5f,1   ,0.5f,2,1,1,0.5f,1,2,0.5f,0.5f};
		
		Type rock = new Type();
		rock.weakness = new float[] {0.5f,0.5f,2,1,2,1,2   ,0.5f,2   ,0.5f,1,1,1,1,1,1,2   ,1};
		rock.strength = new float[] {1   ,2   ,1,1,1,2,0.5f,1   ,0.5f,2   ,1,2,1,1,1,1,0.5f,1};
		
		Type ghost = new Type();
		ghost.weakness = new float[] {0,1,1,1,1,1,0,0.5f,1,1,1,0.5f,1,2,1,2   ,1,1};
		ghost.strength = new float[] {0,1,1,1,1,1,1,1   ,1,1,2,1   ,1,2,1,0.5f,1,1};
		
		Type dragon = new Type();
		dragon.weakness = new float[] {1,0.5f,0.5f,0.5f,0.5f,2,1,1,1,1,1,1,1,1,2,1,1   ,2};
		dragon.strength = new float[] {1,1   ,1   ,1   ,1   ,1,1,1,1,1,1,1,1,1,2,1,0.5f,0};
		
		Type dark = new Type();
		dark.weakness = new float[] {1,1,1,1,1,1,2   ,1,1,1,0,2,1,0.5f,1,0.5f,1,2   };
		dark.strength = new float[] {1,1,1,1,1,1,0.5f,1,1,1,2,1,1,2   ,1,0.5f,1,0.5f};
		
		Type steel = new Type();
		steel.weakness = new float[] {0.5f,2   ,1   ,1   ,0.5f,0.5f,2,0,2,0.5f,0.5f,0.5f,0.5f,1,0.5f,1,0.5f,0.5f};
		steel.strength = new float[] {1   ,0.5f,0.5f,0.5f,1   ,2   ,1,1,1,1   ,1   ,1   ,2   ,1,1   ,1,0.5f,2   };
		
		Type fairy = new Type();
		fairy.weakness = new float[] {1,1   ,1,1,1,1,0.5f,2   ,1,1,1,0.5f,1,1,0,0.5f,2   ,1};
		fairy.strength = new float[] {1,0.5f,1,1,1,1,2   ,0.5f,1,1,1,1   ,1,1,2,2   ,0.5f,1};
		
		String[] typeNames = {"Normal","Fire","Water","Electric","Grass","Ice","Fighting","Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Dark","Steel","Fairy"};
		
		Type[] singleTypeArray = new Type[] {normal, fire, water, electric, grass, ice, fighting, poison, ground, flying, psychic, bug, rock, ghost, dragon, dark, steel, fairy};
		
		for(int i=0;i<singleTypeArray.length;i++) {
			System.out.println(typeNames[i] + ": ");
			System.out.println("Weakness score(less=better) - " + typeScore(singleTypeArray[i].weakness));
			System.out.println("Strength score(more=better) - " + typeScore(singleTypeArray[i].strength));
			System.out.println();
		}
		
	}
	
	public static float typeScore(float[] arr) {
		float sum=0;
		for(int i=0; i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	
	public float[] typeCombo(float[] arr1, float[] arr2) {
		float[] result = new float[18];
		for(int i=0;i<arr1.length;i++) {
			result[i] = arr1[i]*arr2[i];
		}
		return result;
	}
	
	//Returns an array of int representing the count of resistances of pokemon in the order:
	//immunities, strong resistances, resistances, weaknesses, strong weaknesses
	public int[] weakCount(float[] arr) {
		int immunities=0;
		int strResistances=0;
		int resistances=0;
		int weaknesses=0;
		int strWeaknesses=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				immunities++;
			}
			if(arr[i]==0.25) {
				strResistances++;
			}
			if(arr[i]==0.5) {
				resistances++;
			}
			if(arr[i]==2) {
				weaknesses++;
			}
			if(arr[i]==4) {
				strWeaknesses++;
			}
		}
		
		int[] result = new int[] {immunities, strResistances, resistances, weaknesses, strWeaknesses};
		return result;
	}
	
	public int[] streCount(float[] arr) {
		int strong=0;
		int veryStrong=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				strong++;
			}
			if(arr[i]==4) {
				veryStrong++;
			}
		}
		
		int[] result = new int[] {strong, veryStrong};
		return result;
	}
}
