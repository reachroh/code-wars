function strangeMath(n, k){
  let arr = [];
  for(let i = 1; i <= n; i++) arr.push(i);
  return arr.sort().indexOf(k) + 1
}