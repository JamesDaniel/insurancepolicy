import http from 'k6/http';
import { check, fail } from 'k6';

export const options = {
    vus: 10,
    duration: '30s',
};
export default function () {
    const url = 'http://localhost:8080/api/v1/iamalive';

    const payload = JSON.stringify({
        username: 'johndoe'
    });

    const params = {
        headers: {
            'Content-Type': 'application/json',
        },
    };

    const res = http.post(url, payload, params);

    if (!check(res, {'verify request succeeded': (r) => r.status === 200})) {
        fail('Expected request to succeed. But did not!');
    }
}

