const clonarArray = require('./clonarArray');


test('Clonacion correcta del array', () => {
    const array = [1,2,3,4,5];
    expect(clonarArray(array)).toEqual(array);
})