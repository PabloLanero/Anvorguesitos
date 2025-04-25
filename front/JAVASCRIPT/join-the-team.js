
document.addEventListener('DOMContentLoaded', function() { // Espera a que el documento HTML esté completamente cargado
    document.querySelectorAll('.job-title').forEach(title => { // Selecciona TODOS los elementos con clase 'job-title' (los títulos de las ofertas)
        title.addEventListener('click', () => { // A cada título le añade un event listener para clicks
            const details = title.nextElementSibling; // Obtiene el hermano siguiente del título (el div con .job-details)
            details.classList.toggle('active');
             // Alterna (toggle) la clase 'active' en los detalles:
            // - Si la tiene, la quita (colapsa)
            // - Si no la tiene, la añade (expande)
        });
    });
});

