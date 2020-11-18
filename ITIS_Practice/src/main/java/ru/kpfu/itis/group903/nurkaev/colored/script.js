document.addEventListener('DOMContentLoaded', function () {
    Array.from(document.getElementsByClassName('one-color-change')).forEach(btn => {
        btn.addEventListener('click', () => {
            document.body.style.backgroundColor = window.getComputedStyle(btn).backgroundColor;
        });
    });

    let colors = ['rgb(192, 33, 49)', 'rgb(31, 130, 54)', 'rgb(0, 100, 207)'];
    let i = 0;
    Array.from(document.getElementsByClassName('cyclic-color-change')).forEach(btn => {
        btn.addEventListener('click', () => {
            document.body.style.backgroundColor = colors[i++];
            i %= 3;
        })
    });
});