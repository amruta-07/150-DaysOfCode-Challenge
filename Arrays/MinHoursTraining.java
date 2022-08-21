class Solution {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int need=0;
        int energysum=0;
        for(int i=0;i<energy.length;i++){
            energysum=energysum+energy[i];
        }
        while (initialEnergy<=energysum){
            need++;
            initialEnergy++;
            
        }


        for(int i=0;i<energy.length;i++){
            
            
            if(experience[i]>=initialExperience){
                int need1=experience[i];
                // System.out.println(initialExperience);
                // System.out.println(need1);
                while (initialExperience<=need1) {
                    need++;
                    initialExperience++;
                }
                // System.out.println("ini "+ initialExperience);
                
            }
            
           if(energy[i]<initialEnergy&&experience[i]<initialExperience){
                initialExperience=initialExperience+ experience[i];
                initialEnergy=initialEnergy-energy[i];
            
            }
   
        
    }
        
   
    
    return need;
            
        }
}