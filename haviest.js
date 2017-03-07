function heaviestArray(arrays){
    var maxWeight = 0;
    var heaviest = null;
    for(var i = 0; i < arrays.length;i++){
        var thisArray = arrays[i];
        var thisWeight = arrayWeight(thisArray);
        if(thisWeight > maxWeight){
            maxWeight = thisWeight;
            heaviest = thisArray;
        } else if(thisWeight < maxWeight){        
            maxWeight = thisWeight;
            heaviest = arrays[i-1];
        }
    }
    return heaviest;
}

function arrayWeight(array){
    var weight = array[0];
    for(var i =0; i<array.length;i++){
        weight += array[i];           
    }
    return weight;
}

console.log(heaviestArray([[-1,-2],[-3,-4]]));
