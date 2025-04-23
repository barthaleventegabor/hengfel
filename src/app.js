
//  File: app.js
//  Author: Bartha Levente
//  Copyright: 2025, Bartha Levente
//  Group: IN
//  Date: 2025-04-23
//  Github: https://github.com/barthaleventegabor/
//  Licenc: MIT

const calculateButton = document.querySelector('#calculateButton');
const sugarInput = document.querySelector('#sugar');
const magassagInput = document.querySelector('#magassag');
const felszinInput = document.querySelector('#felszin');


calculateButton.addEventListener('click', () => {

    const sugar = parseFloat(sugarInput.value);
    const magassag = parseFloat(magassagInput.value);
    const felszin = 2 * Math.PI * sugar*(sugar + magassag);
    
    
    felszinInput.value = felszin;

})