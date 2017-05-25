import {Injectable} from '@angular/core';

@Injectable()
export class Cookie {

  public static checkIfExists(name: string): boolean {
    name = encodeURIComponent(name);
    let regexp = new RegExp('(?:^' + name + '|;\\s*' + name + ')=(.*?)(?:;|$)', 'g');
    let exists = regexp.test(document.cookie);
    return exists;
  }

  public static get(name: string): string {
    if (Cookie.checkIfExists(name)) {
      name = encodeURIComponent(name);
      let regexp = new RegExp('(?:^' + name + '|;\\s*' + name + ')=(.*?)(?:;|$)', 'g');
      let result = regexp.exec(document.cookie);
      return decodeURIComponent(result[1]);
    } else {
      return '';
    }
  }

  public static set(name: string, value: string, expires?: number | Date, path?: string, domain?: string, secure?: boolean) {
    let cookieStr = encodeURIComponent(name) + '=' + encodeURIComponent(value) + ';';

    if (expires) {
      if (typeof expires === 'number') {
        let dtExpires = new Date(new Date().getTime() + expires * 1000 * 60 * 60 * 24);
        cookieStr += 'expires=' + dtExpires.toUTCString() + ';';
      } else {
        cookieStr += 'expires=' + expires.toUTCString() + ';';
      }
    }

    if (path) {
      cookieStr += 'path=' + path + ';';
    }
    if (domain) {
      cookieStr += 'domain=' + domain + ';';
    }
    if (secure) {
      cookieStr += 'secure;';
    }
    document.cookie = cookieStr;
  }

  public static delete(name: string, path?: string, domain?: string) {
    if (Cookie.get(name)) {
      Cookie.set(name, '', -1, path, domain);
    }
  }

}
