import gulp from 'gulp';
import uglify from 'gulp-uglify';
import uglifycss from 'gulp-uglifycss';
import htmlmin from 'gulp-htmlmin';
import ngAnnotate from 'gulp-ng-annotate-patched';
import terser from 'gulp-terser';

gulp.task('minify-js', function () {
  return gulp.src(['js/**/*.js'])
    .pipe(ngAnnotate())
    .pipe(terser({
      mangle: {
        keep_classnames: true
      }
    }))
    .pipe(gulp.dest('dist/js/'));
});

gulp.task('minify-css', function () {
  return gulp.src(['css/**/*', '!css/fonts/**'])
    .pipe(uglifycss())
    .pipe(gulp.dest('dist/css/'));
});

gulp.task('minify-components-css', function () {
  return gulp.src(['components/css/**'])
    .pipe(uglifycss())
    .pipe(gulp.dest('dist/components/css/'));
});

gulp.task('minify-components-js', function () {
  return gulp.src(['components/js/**'])
    .pipe(uglify())
    .pipe(gulp.dest('dist/components/js/'));
});

gulp.task('minify-components-templates', function () {
  return gulp.src(['components/templates/**'])
    .pipe(htmlmin({
      collapseWhitespace: true
    }))
    .pipe(gulp.dest('dist/components/templates/'));
});

gulp.task('minify-components-report', function () {
  return gulp.src(['components/reports/**'])
    .pipe(htmlmin({
      collapseWhitespace: true
    }))
    .pipe(gulp.dest('dist/components/reports/'));
});

gulp.task('i18n', function () {
  return gulp.src('i18n/**').pipe(gulp.dest('dist/i18n/'));
});

gulp.task('build', gulp.series(
  'minify-js',
  'minify-css',
  'minify-components-css',
  'minify-components-js',
  'minify-components-templates',
  'minify-components-report',
  'i18n'
));

gulp.task('default', gulp.series('build'));
