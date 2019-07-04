
/*
If compareFunction(a, b) is less than 0, sort a to an index lower than b, i.e. a comes first.
If compareFunction(a, b) returns 0, leave a and b unchanged with respect to each other, but sorted with respect to all different elements.
If compareFunction(a, b) is greater than 0, sort b to an index lower than a, i.e. b comes first.
 */
const numbers = [5,1,3,9,11,100,87,44,23,67];
numbers.sort( (a, b) => {
  return !(a % 2);
});

numbers;

const people = [
  {name:'Fred', role:'Developer'},
  {name:'Suzy', role:'DevEloper'},
  {name:'Gina', role:'Manager'},
  {name:'Jim', role:'Support'},
];

const newPeople = people.sort( (a,b) =>
  a.name.toUpperCase() < b.name.toUpperCase()
);

newPeople;
people;
© Code Fellows 2019