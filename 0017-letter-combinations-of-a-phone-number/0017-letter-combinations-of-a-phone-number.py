class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        
        #
        #            2   3
        #            |    \    
        #           abc   def
        #        
        #
         
            map = {'0': '', '1': '', '2': 'abc', '3':'def', '4':'ghi', '5': 'jkl', '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
            
            #if digits is empty return empty
            if digits =="": return []
            
            #list of digits and letter combo passed in
            #for example if given 2 then this will output a list
            #of corresponding letters
            listNum = [""]
            
            
            # iterate through each digit referenced
            for d in digits:
                #create a temp list to add to
                t= []
                #go deeper into the referenced string d and get every letter (e)
                for e in map[d]:
                    #one more time add at that index to the string combo we are creating traversing every number multiple times- *I'm realizing this is going to make the algo slow because I'm traversing potentially a number multiple times to get a unique combination.
                    for l in listNum:
                        t.append(l+e)
                listNum = t
            
            return listNum
        