function reverseWordsWithoutBuiltInFunctions(sentence) {
    let reversedSentence = '';
    let wordStart = 0;

    for (let i = 0; i <= sentence.length; i++) {
        if (i === sentence.length || sentence[i] === ' ') {
            let word = '';

            for (let j = wordStart; j < i; j++) {
                word = sentence[j] + word;
            }

            if (reversedSentence !== '') {
                reversedSentence += ' ';
            }

            reversedSentence += word;
            wordStart = i + 1;
        }
    }

    return reversedSentence;
}

// Get user input using prompt
let inputSentence = prompt("Enter a sentence:");
let reversed = reverseWordsWithoutBuiltInFunctions(inputSentence);

console.log("Reversed Sentence: ", reversed);