function disemvowel(str) {
  let re = /[aeiou]/gi
  return str.replace( re, '' )
}