/**
 * System configuration for Angular 2 samples
 * Adjust as necessary for your application needs.
 */
(function (global) {
  System.config({
    paths: {
      // paths serve as alias
      'npm:': '../../node_modules/'
    },
    // map tells the System loader where to look for things
    map: {
      // for template imports
      text: 'npm:systemjs-plugin-text/text.js',
      // our app is within the app folder
      app: (global.oasp4js && global.oasp4js.currentAppDir) || 'app',

      // angular bundles
      '@angular/core': 'npm:@angular/core/bundles/core.umd.js',
      '@angular/common': 'npm:@angular/common/bundles/common.umd.js',
      '@angular/compiler': 'npm:@angular/compiler/bundles/compiler.umd.js',
      '@angular/platform-browser': 'npm:@angular/platform-browser/bundles/platform-browser.umd.js',
      '@angular/platform-browser-dynamic': 'npm:@angular/platform-browser-dynamic/bundles/platform-browser-dynamic.umd.js',
      '@angular/http': 'npm:@angular/http/bundles/http.umd.js',
      '@angular/router': 'npm:@angular/router/bundles/router.umd.js',
      '@angular/forms': 'npm:@angular/forms/bundles/forms.umd.js',
      'ng2-dragula': 'npm:ng2-dragula/bundles/ng2-dragula.umd.js',

      // other libraries
      'rxjs': 'npm:rxjs',
      'lodash': 'npm:lodash',
      '@ng-bootstrap/ng-bootstrap': 'node_modules/@ng-bootstrap/ng-bootstrap/bundles/ng-bootstrap.js'
    },
    // meta: {
    //   'dragula': {
    //     format: 'commonjs'
    //   }
    // },
    // packages tells the System loader how to load when no filename and/or no extension
    packages: {
      app: {
        main: './main.js',
        defaultExtension: 'js'
      },
      rxjs: {
        defaultExtension: 'js'
      },
      'lodash': {
        main: './index.js',
        defaultExtension: 'js'
      }
    }
  });
})(this);
